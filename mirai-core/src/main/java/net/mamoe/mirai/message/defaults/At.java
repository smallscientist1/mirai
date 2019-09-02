package net.mamoe.mirai.message.defaults;

import net.mamoe.mirai.contact.QQ;
import net.mamoe.mirai.message.Message;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author Him188moe
 */
public final class At extends Message {
    private final long target;

    public At(@NotNull QQ target) {
        this(Objects.requireNonNull(target).getNumber());
    }

    public At(long target) {
        this.target = target;
    }

    public long getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return null;
    }
}
