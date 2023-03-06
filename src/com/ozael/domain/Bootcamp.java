package com.ozael.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate beginDate = LocalDate.now();
    private final LocalDate finishDate = beginDate.plusDays(45);
    private Set<Dev> registeredDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Dev> getRegisteredDevs() {
        return registeredDevs;
    }

    public void setRegisteredDevs(Set<Dev> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;

        if (getName() != null ? !getName().equals(bootcamp.getName()) : bootcamp.getName() != null) return false;
        if (getDescription() != null ? !getDescription().equals(bootcamp.getDescription()) : bootcamp.getDescription() != null)
            return false;
        if (getBeginDate() != null ? !getBeginDate().equals(bootcamp.getBeginDate()) : bootcamp.getBeginDate() != null)
            return false;
        if (getFinishDate() != null ? !getFinishDate().equals(bootcamp.getFinishDate()) : bootcamp.getFinishDate() != null)
            return false;
        if (getRegisteredDevs() != null ? !getRegisteredDevs().equals(bootcamp.getRegisteredDevs()) : bootcamp.getRegisteredDevs() != null)
            return false;
        return getContents() != null ? getContents().equals(bootcamp.getContents()) : bootcamp.getContents() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getBeginDate() != null ? getBeginDate().hashCode() : 0);
        result = 31 * result + (getFinishDate() != null ? getFinishDate().hashCode() : 0);
        result = 31 * result + (getRegisteredDevs() != null ? getRegisteredDevs().hashCode() : 0);
        result = 31 * result + (getContents() != null ? getContents().hashCode() : 0);
        return result;
    }
}
