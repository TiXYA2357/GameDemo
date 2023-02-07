package org.sobadfish.gamedemo.item;

import cn.nukkit.item.Item;
import org.sobadfish.gamedemo.player.PlayerInfo;

/**
 * @author Sobadfish
 * @date 2023/2/7
 */
public interface ICustomItem {

    /**
     * 被点击触发
     * @param player 游戏内玩家
     * */
    void onClick(PlayerInfo player);

    /**
     * 触发点击事件后是否消耗此物品
     * @return 是否被消耗
     * */
    boolean canBeUse();

    /**
     * 获取物品实体类
     * @return 物品
     * */
    Item getItem();

}
