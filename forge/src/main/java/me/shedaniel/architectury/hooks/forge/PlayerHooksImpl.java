/*
 * Copyright 2020 shedaniel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.shedaniel.architectury.hooks.forge;

import me.shedaniel.architectury.hooks.PlayerHooks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.common.util.FakePlayer;

public class PlayerHooksImpl implements PlayerHooks.Impl {
    @Override
    public boolean isFake(PlayerEntity playerEntity) {
        return playerEntity instanceof FakePlayer;
    }
    
    @Override
    public void closeContainer(PlayerEntity playerEntity) {
        playerEntity.closeContainer();
    }
}
