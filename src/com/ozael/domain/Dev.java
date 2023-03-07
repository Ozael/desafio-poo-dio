package com.ozael.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void registeredBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcTotalXP() {
        return this.finishedContent.stream().mapToDouble(Content::calcXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;

        if (getName() != null ? !getName().equals(dev.getName()) : dev.getName() != null) return false;
        if (getSubscribedContent() != null ? !getSubscribedContent().equals(dev.getSubscribedContent()) : dev.getSubscribedContent() != null)
            return false;
        return getFinishedContent() != null ? getFinishedContent().equals(dev.getFinishedContent()) : dev.getFinishedContent() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSubscribedContent() != null ? getSubscribedContent().hashCode() : 0);
        result = 31 * result + (getFinishedContent() != null ? getFinishedContent().hashCode() : 0);
        return result;
    }
}
