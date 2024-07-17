@file:Suppress("NOTHING_TO_INLINE")

package net.azisaba.kotlinnmsextension.v1_20_R4

import net.minecraft.core.component.DataComponentMap
import net.minecraft.core.component.DataComponentPatch
import net.minecraft.core.component.DataComponentType
import net.minecraft.network.chat.IChatBaseComponent
import net.minecraft.world.entity.player.EntityHuman
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag
import java.util.function.BiFunction
import java.util.function.UnaryOperator

inline val ItemStack.item: Item
    inline get() = g()
inline var ItemStack.amount: Int
    inline get() = I()
    inline set(value) = e(value)

inline fun <T> ItemStack.set(type: DataComponentType<in T>, value: T): T? = b(type, value)
inline fun <T, U> ItemStack.update(type: DataComponentType<T>, defaultValue: T, change: U, applier: BiFunction<T, U, T>): T? = a(type, defaultValue, change, applier)
inline fun <T> ItemStack.update(type: DataComponentType<T>, defaultValue: T, applier: UnaryOperator<T>): T? = a(type, defaultValue, applier)
inline fun <T> ItemStack.remove(type: DataComponentType<T>): T? = c(type)
inline fun ItemStack.applyComponentsAndValidate(changes: DataComponentPatch): Unit = a(changes)
inline fun ItemStack.applyComponents(changes: DataComponentPatch): Unit = b(changes)
inline fun ItemStack.applyComponents(map: DataComponentMap): Unit = b(map)
inline fun ItemStack.getComponents(): DataComponentMap = a()
inline fun ItemStack.getPrototype(): DataComponentMap = c()
inline fun ItemStack.getItemName(): IChatBaseComponent = x()
inline fun ItemStack.getTooltipLines(itemb: Item.b, human: EntityHuman, flag: TooltipFlag): List<IChatBaseComponent> = a(itemb, human, flag)
