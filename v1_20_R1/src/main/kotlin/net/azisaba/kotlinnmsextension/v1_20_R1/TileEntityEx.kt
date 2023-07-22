package net.azisaba.kotlinnmsextension.v1_20_R1

import com.mojang.authlib.GameProfile
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.world.level.block.entity.TileEntity
import net.minecraft.world.level.block.entity.TileEntityFurnace
import net.minecraft.world.level.block.entity.TileEntitySkull

fun TileEntity.save(): NBTTagCompound = o()
fun TileEntity.load(tag: NBTTagCompound) = a(tag)

fun TileEntitySkull.setGameProfile(profile: GameProfile) = a(profile)

var TileEntityFurnace.burnTime: Int
    get() = u
    set(value) { u = value }
var TileEntityFurnace.cookTime: Int
    get() = x
    set(value)  { x = value }
