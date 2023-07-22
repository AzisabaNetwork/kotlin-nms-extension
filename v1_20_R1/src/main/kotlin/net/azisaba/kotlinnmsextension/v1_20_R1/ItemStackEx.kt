package net.azisaba.kotlinnmsextension.v1_20_R1

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.nbt.NBTTagList
import net.minecraft.network.chat.IChatBaseComponent
import net.minecraft.world.entity.player.EntityHuman
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag

val ItemStack.item: Item
    get() = d()
var ItemStack.amount: Int
    get() = L()
    set(value) = f(value)
var ItemStack.tag: NBTTagCompound?
    get() = v()
    set(value) = c(value)
fun ItemStack.getOrCreateTag(): NBTTagCompound = w()
fun ItemStack.getOrCreateTagElement(key: String): NBTTagCompound = a(key)
fun ItemStack.getTagElement(key: String): NBTTagCompound? = b(key)
fun ItemStack.getEnchantmentsAsNBT(): NBTTagList = x()
fun ItemStack.getItemName(): IChatBaseComponent = y()
fun ItemStack.setDisplayName(component: IChatBaseComponent?): ItemStack = a(component)
fun ItemStack.hasDisplayName() = A()
fun ItemStack.removeDisplayName() = z()
fun ItemStack.getTooltipLines(human: EntityHuman, flag: TooltipFlag): List<IChatBaseComponent> = a(human, flag)
fun ItemStack.isEmpty(): Boolean = b()
