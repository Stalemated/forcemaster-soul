package com.stalemated.soulmaster.client;

import com.stalemated.soulmaster.effects.Effects;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.forcemaster_rpg.client.effect.ArcaneOverDriveRenderer;
import net.forcemaster_rpg.client.effect.BarqEsnaParticles;
import net.spell_engine.api.effect.CustomModelStatusEffect;
import net.spell_engine.api.effect.CustomParticleStatusEffect;

@Environment(EnvType.CLIENT)
public class SoulmasterClient implements ClientModInitializer {
	public void onInitializeClient() {
        CustomParticleStatusEffect.register(Effects.SOUL_BARQ_ESNA, new BarqEsnaParticles(1));
        CustomModelStatusEffect.register(Effects.SOUL_OVERFLOW, new ArcaneOverDriveRenderer());
	}
}
