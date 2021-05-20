package ac.grim.grimac.utils.collisions.types;

import ac.grim.grimac.player.GrimPlayer;
import ac.grim.grimac.utils.blockdata.types.WrappedBlockDataValue;
import ac.grim.grimac.utils.collisions.CollisionBox;
import io.github.retrooper.packetevents.utils.player.ClientVersion;

public interface CollisionFactory {
    CollisionBox fetch(GrimPlayer player, ClientVersion version, WrappedBlockDataValue block, int x, int y, int z);
}