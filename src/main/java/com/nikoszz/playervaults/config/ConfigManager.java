/*
 * PlayerVaultsX
 * Copyright (C) 2021 nikoszz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.nikoszz.playervaults.config;


import com.nikoszz.playervaults.PlayerVaults;
import com.nikoszz.playervaults.config.file.Config;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.io.IOException;
import java.util.logging.Level;

public class ConfigManager {
    private final PlayerVaults plugin;
    private final Config config = new Config();

    public ConfigManager(@NonNull PlayerVaults plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {
        try {
            Loader.loadAndSave("main", this.config);
        } catch (IOException | IllegalAccessException e) {
            this.plugin.getLogger().log(Level.SEVERE, "Could not load config. Using all default values until resolved.", e);
        }
    }

    public @NonNull Config getConf() {
        return this.config;
    }
}
