package com.ozael.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void registeredBootcamp(Bootcamp bootcamp) {
    }

    public void progress() {
    }

    public void calcTotalXP() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

        if (getNome() != null ? !getNome().equals(dev.getNome()) : dev.getNome() != null) return false;
        if (getSubscribedContent() != null ? !getSubscribedContent().equals(dev.getSubscribedContent()) : dev.getSubscribedContent() != null)
            return false;
        return getFinishedContent() != null ? getFinishedContent().equals(dev.getFinishedContent()) : dev.getFinishedContent() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getSubscribedContent() != null ? getSubscribedContent().hashCode() : 0);
        result = 31 * result + (getFinishedContent() != null ? getFinishedContent().hashCode() : 0);
        return result;
    }
}
