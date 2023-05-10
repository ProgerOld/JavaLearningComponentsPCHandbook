package com.example.javalearningcomponentspchandbook;

public class PCComponent {
    private String name; // поле названия
    private String componentDescription; // поле описания
    private int componentResource; // поле ресурса

    public PCComponent(String name, String componentDescription, int componentResource) {
        this.name = name;
        this.componentDescription = componentDescription;
        this.componentResource = componentResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponentDescription() {
        return componentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    public int getComponentResource() {
        return componentResource;
    }

    public void setComponentResource(int componentResource) {
        this.componentResource = componentResource;
    }
}
