/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.abilities.effects.mana;

import mage.Mana;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.effects.common.ManaEffect;
import mage.constants.ColoredManaSymbol;
import mage.game.Game;

/**
 * @author LevelX2
 */
public class AddManaChosenColorEffect extends ManaEffect {

    public AddManaChosenColorEffect() {
        super();
        staticText = "Add one mana of the chosen color";
    }

    public AddManaChosenColorEffect(final AddManaChosenColorEffect effect) {
        super(effect);
    }

    @Override
    public Mana produceMana(Game game, Ability source) {
        if (game != null) {
            ObjectColor color = (ObjectColor) game.getState().getValue(source.getSourceId() + "_color");
            if (color != null) {
                return new Mana(ColoredManaSymbol.lookup(color.toString().charAt(0)));
            }
        }
        return new Mana();
    }

    @Override
    public AddManaChosenColorEffect copy() {
        return new AddManaChosenColorEffect(this);
    }
}
