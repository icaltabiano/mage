/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.abilities.dynamicvalue.common;

import java.util.*;

import mage.abilities.Ability;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.Effect;
import mage.filter.common.FilterNonlandPermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;

/**
 * Each colored mana symbol (e.g. {U}) in the mana costs of permanents you
 * control counts toward your devotion to that color.
 *
 * @author LevelX2
 */
public class LongestStraight implements DynamicValue {

    private FilterNonlandPermanent noLand = new FilterNonlandPermanent();

    @Override
    public int calculate(Game game, Ability sourceAbility, Effect effect) {
        ArrayList<Integer> cmcList = new ArrayList<Integer>();

        int straight = 0;
        int savestraight = 0;
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents(noLand, sourceAbility.getControllerId(), game)) {
            int cmc = permanent.getConvertedManaCost();
            cmcList.add(cmc);
        }
        if (cmcList.size() > 0) {
            Collections.sort(cmcList);
            Set st = new HashSet();
            st.addAll(cmcList);
            cmcList.clear();
            cmcList.addAll(st);
            straight = 1;
            for (int i = 0; i < cmcList.size(); i++) {
                if (i == 0 ) continue;
                if (cmcList.get(i) == cmcList.get(i - 1) + 1) {
                    straight++;
                } else{
                    if (straight > savestraight){
                        savestraight = straight;
                    }
                    straight = 1;
                }
            }
        }
        if (savestraight > straight){
            return savestraight;
        }
        return straight;
    }

    @Override
    public LongestStraight copy() {
        return new LongestStraight();
    }

    @Override
    public String toString() {
        return "X";
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("your longest Straight");
        return sb.toString();
    }
}