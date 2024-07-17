package net.azisaba.kotlinnmsextension.v1_20_R4

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.network.chat.IChatBaseComponent
import net.minecraft.network.syncher.DataWatcher
import net.minecraft.server.level.EntityPlayer
import net.minecraft.world.ITileInventory
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EntityAreaEffectCloud
import net.minecraft.world.entity.EntityInsentient
import net.minecraft.world.entity.EnumItemSlot
import net.minecraft.world.entity.decoration.EntityArmorStand
import net.minecraft.world.entity.monster.EntitySlime
import net.minecraft.world.entity.player.EntityHuman
import net.minecraft.world.inventory.Container
import net.minecraft.world.item.ItemStack
import net.minecraft.world.phys.AxisAlignedBB
import java.util.*

val Entity.dataWatcher: DataWatcher
    get() = ap()
val Entity.id: Int
    get() = al()
val Entity.uniqueId: UUID
    get() = cz()
val Entity.uniqueIdString: String
    get() = cA()
var Entity.yaw: Float // xRot
    get() = dH()
    set(value) = s(value)
var Entity.pitch: Float // yRot
    get() = dF()
    set(value) = r(value)
var Entity.customName: IChatBaseComponent?
    get() = ah()
    set(value) = b(value)
var Entity.isCustomNameVisible: Boolean
    get() = cE()
    set(value) = o(value)
var Entity.isInvulnerable: Boolean
    get() = cu()
    set(value) = n(value)
var Entity.isInvisible: Boolean
    get() = ch()
    set(value) = k(value)
fun Entity.setLocation(x: Double, y: Double, z: Double) = e(x, y, z)
fun Entity.setPositionRotation(x: Double, y: Double, z: Double, pitch: Float, yaw: Float) = a(x, y, z, pitch, yaw)
fun Entity.setPositionRaw(x: Double, y: Double, z: Double) = p(x, y, z)
fun Entity.getAABB(): AxisAlignedBB = cK()
fun Entity.getDisplayName(): IChatBaseComponent? = O_()
fun Entity.hasCustomName(): Boolean = ag()
fun Entity.sendSystemMessage(component: IChatBaseComponent) = a(component)
fun Entity.save(tag: NBTTagCompound): NBTTagCompound = f(tag)
fun Entity.load(tag: NBTTagCompound) = g(tag)

var EntityInsentient.isNoAI: Boolean
    get() = gg()
    set(value) = t(value)
var EntityInsentient.isLeftHanded: Boolean
    get() = gh()
    set(value) = u(value)
var EntityInsentient.isAggressive: Boolean
    get() = gi()
    set(value) = v(value)

var EntityAreaEffectCloud.radius: Float
    get() = g()
    set(value) = a(value)

fun EntityHuman.setSlot(slot: EnumItemSlot, item: ItemStack): Unit = a(slot, item)

fun EntityPlayer.openContainer(container: Container): Unit = a(container)
fun EntityPlayer.openContainer(container: ITileInventory): OptionalInt = a(container)

fun EntityArmorStand.setSlot(slot: EnumItemSlot, item: ItemStack): Unit = a(slot, item)

fun EntitySlime.setSize(size: Int, refreshHealth: Boolean): Unit = a(size, refreshHealth)
