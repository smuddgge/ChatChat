package at.helpch.chatchat.hooks.towny;

import com.palmergames.bukkit.towny.object.Resident;
import com.palmergames.bukkit.towny.object.ResidentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class TownyNationChannel extends AbstractTownyChannel {

    public TownyNationChannel(@NotNull final String name,
                            @NotNull final String messagePrefix,
                            @NotNull final List<String> toggleCommands,
                            @NotNull final String channelPrefix) {
        super(name, messagePrefix, toggleCommands, channelPrefix);
    }

    @Override
    protected @Nullable ResidentList residentList(@NotNull final Resident resident) {
        return resident.getNationOrNull();
    }
}
