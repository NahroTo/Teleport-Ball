package com.nahroto.teleportball.huds.menuhud.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.nahroto.teleportball.fonts.Font;
import com.nahroto.teleportball.huds.LabelGroup;

public class TitleLabel extends LabelGroup
{
    public TitleLabel()
    {
        font = new Font("fonts/district.otf", 125, Color.WHITE, true);
        labelStyle = new Label.LabelStyle(font.getFont(), Color.WHITE);
        text = "Teleport Ball";
        label = new Label(text, labelStyle);
    }
}
