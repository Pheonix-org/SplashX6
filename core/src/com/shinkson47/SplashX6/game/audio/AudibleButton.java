package com.shinkson47.SplashX6.game.audio;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import org.w3c.dom.Text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

/**
 *
 */
 class AudibleButton extends Button {
    // TODO - FURTHER DEVELOPMENT

    public AudibleButton() {
        addListener(new ClickListener());
        {
            AudioController.playButttonSound();
        }
    }
}

//    public TextButton addAudibleButton(String text, Consumer<InputEvent> e) {
//         TextButton buttom = bu
//         return buttom;
//    }
//}



//    protected TextButton addButton(String Text, Consumer<InputEvent> e){
//        TextButton b = button(Text, e);
//        add(b).fill().row();
//        return b;
//    }