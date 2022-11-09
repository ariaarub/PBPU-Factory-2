package Factories;

import Buttons.*;
import Checkboxes.*;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}