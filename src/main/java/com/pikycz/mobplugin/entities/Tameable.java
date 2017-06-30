package com.pikycz.mobplugin.entities;

import cn.nukkit.Player;

/**
 * Interface that is implemented in tameable entities
 */
public interface Tameable {

    String NAMED_TAG_OWNER = "Owner";

    String NAMED_TAG_OWNER_UUID = "OwnerUUID";

    String NAMED_TAG_SITTING = "Sitting";

    Player getOwner();

    void setOwner(Player player);

    String getName();

}
