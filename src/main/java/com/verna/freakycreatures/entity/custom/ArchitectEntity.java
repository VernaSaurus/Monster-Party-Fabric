package com.verna.freakycreatures.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ArchitectEntity extends PassiveEntity {

    public ArchitectEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0, 0.0F));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(10, new ArchitectEntity.BuildStructureGoal(this));
        this.goalSelector.add(9, new ArchitectEntity.SurveyLandGoal(this));
    }

    @Override
    public boolean hurtByWater() {
        return true;
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }

    static class BuildStructureGoal extends Goal {
        private final ArchitectEntity architect;

        public BuildStructureGoal(ArchitectEntity architect) {
            this.architect = architect;
        }

        @Override
        public boolean canStart() {
            return false;
        }
    }

    static class SurveyLandGoal extends Goal {
        private final ArchitectEntity architect;

        public SurveyLandGoal(ArchitectEntity architect) {
            this.architect = architect;
        }

        @Override
        public boolean canStart() {
            return false;
        }
    }
}
