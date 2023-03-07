package io.github.moulberry.moulconfig.test;

import io.github.moulberry.moulconfig.annotations.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class TestCategory {
    @ConfigOption(name = "Text Test", desc = "Text Editor Test")
    @ConfigEditorText
    public String text = "Text";
    @ConfigOption(name = "Another Text test", desc = "Text Editor Test")
    @ConfigEditorText
    public String text2 = "Text 2";
    @ConfigOption(name = "Boolean test", desc = "Toggle test")
    @ConfigEditorBoolean
    public boolean bool = true;
    @ConfigOption(name = "Accordion", desc = "First accordion")
    @ConfigEditorAccordion(id = 0)
    public boolean accordionOne = false;

    @ConfigOption(name = "Accordion", desc = "First accordion")
    @ConfigEditorAccordion(id = 1)
    @ConfigAccordionId(id = 0)
    public boolean accordionInner = false;

    @ConfigOption(name = "Color Picker", desc = "Color Picker test")
    @ConfigEditorColour
    @ConfigAccordionId(id = 1)
    public String colour = "0:0:0:0:0";

    @ConfigOption(name = "Number", desc = "Slider test")
    @ConfigEditorSlider(minValue = 0, maxValue = 10, minStep = 1)
    @ConfigAccordionId(id = 0)
    public int slider = 0;

    @ConfigOption(name = "Accordion", desc = "First accordion")
    @ConfigEditorAccordion(id = 2)
    public boolean accordionTwo = false;

    @ConfigOption(name = "Drag List", desc = "Using integers")
    @ConfigEditorDraggableList(
        exampleText = {"A", "2", "3", "4"}
    )
    public List<Integer> thingy = new ArrayList<>();

    @ConfigOption(name = "Drag List 2", desc = "Using EnumSet")
    @ConfigEditorDraggableList()
    public EnumSet<TestEnum> draggableEnum = EnumSet.noneOf(TestEnum.class);

    enum TestEnum {
        A, B, C, D, E;

        @Override
        public String toString() {
            return "Enum Value " + name();
        }
    }


}
