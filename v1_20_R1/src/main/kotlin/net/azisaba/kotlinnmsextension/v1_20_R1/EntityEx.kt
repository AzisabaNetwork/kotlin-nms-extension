package net.azisaba.kotlinnmsextension.v1_20_R1

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
    get() = aj()
val Entity.id: Int
    get() = af()
val Entity.uniqueId: UUID
    get() = ct()
val Entity.uniqueIdString: String
    get() = cu()
var Entity.yaw: Float
    get() = dy()
    set(value) = a_(value)
var Entity.pitch: Float
    get() = dA()
    set(value) = b_(value)
var Entity.customName: IChatBaseComponent?
    get() = ab()
    set(value) = b(value)
var Entity.isCustomNameVisible: Boolean
    get() = cy()
    set(value) = n(value)
var Entity.isInvulnerable: Boolean
    get() = co()
    set(value) = m(value)
var Entity.isInvisible: Boolean
    get() = cb()
    set(value) = j(value)
fun Entity.setLocation(x: Double, y: Double, z: Double) = e(x, y, z)
fun Entity.setPositionRotation(x: Double, y: Double, z: Double, pitch: Float, yaw: Float) = a(x, y, z, pitch, yaw)
fun Entity.setPositionRaw(x: Double, y: Double, z: Double) = p(x, y, z)
fun Entity.getAABB(): AxisAlignedBB = cE()
fun Entity.getDisplayName(): IChatBaseComponent = H_()
fun Entity.hasCustomName(): Boolean = aa()
fun Entity.sendSystemMessage(component: IChatBaseComponent) = a(component)
fun Entity.save(tag: NBTTagCompound): NBTTagCompound = f(tag)
fun Entity.load(tag: NBTTagCompound) = g(tag)

var EntityInsentient.isNoAI: Boolean
    get() = fQ()
    set(value) = t(value)
var EntityInsentient.isLeftHanded: Boolean
    get() = fR()
    set(value) = u(value)
var EntityInsentient.isAggressive: Boolean
    get() = fS()
    set(value) = v(value)

var EntityAreaEffectCloud.radius: Float
    get() = h()
    set(value) = a(value)

fun EntityHuman.setSlot(slot: EnumItemSlot, item: ItemStack) = a(slot, item)

fun EntityPlayer.openContainer(container: Container) = a(container)
fun EntityPlayer.openContainer(container: ITileInventory): OptionalInt = a(container)

fun EntityArmorStand.setSlot(slot: EnumItemSlot, item: ItemStack) = a(slot, item)

fun EntitySlime.setSize(size: Int, refreshHealth: Boolean) = a(size, refreshHealth)
