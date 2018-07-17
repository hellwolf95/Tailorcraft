package Hellwolf95.tailormod.Init;

import java.util.ArrayList;
import java.util.List;
import Hellwolf95.tailormod.Items.ItemBase;
import Hellwolf95.tailormod.Items.armor.ArmorBase;
import Hellwolf95.tailormod.Util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	//boots,legs,chest,helmet for array
	//name,durability,reduction amount,enchantability,sound on equip, toughness
		//Bikini Armor
	public static final ArmorMaterial ARMOR_MATERIAL_BIKINI = EnumHelper.addArmorMaterial("armor_material_bikini", Reference.MOD_ID + ":bikini",10,new int[] {1,1,1,1},25,SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0.0f);
		//Metal Armor
	public static final ArmorMaterial ARMOR_MATERIAL_METAL = EnumHelper.addArmorMaterial("armor_material_metal", Reference.MOD_ID + ":metal",12,new int[] {1,3,5,2},25,SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,0.0f);
		//Puratina Armor
	public static final ArmorMaterial ARMOR_MATERIAL_PURATINA = EnumHelper.addArmorMaterial
			("armor_material_puratina", 
			Reference.MOD_ID + ":puratina",
			12,
			new int[] {1,3,5,2},
			25,
			SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
			0.0f);
		//Misuriru Armor
	public static final ArmorMaterial ARMOR_MATERIAL_MISURIRU = EnumHelper.addArmorMaterial
			("armor_material_misuriru", 
			Reference.MOD_ID + ":misuriru",
			12,
			new int[] {1,3,5,2},
			25,
			SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
			0.0f);
		//Hagane Armor
	public static final ArmorMaterial ARMOR_MATERIAL_HAGANE = EnumHelper.addArmorMaterial
			("armor_material_hagane", 
			Reference.MOD_ID + ":hagane",
			12,
			new int[] {1,3,5,2},
			25,
			SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
			0.0f);
		//Ryuukisi Armor
	public static final ArmorMaterial ARMOR_MATERIAL_RYUUKISI = EnumHelper.addArmorMaterial
			("armor_material_ryuukisi", 
			Reference.MOD_ID + ":ryuukisi",
			12,
			new int[] {1,3,5,2},
			25,
			SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
			0.0f);
	//Tenku Armor
public static final ArmorMaterial ARMOR_MATERIAL_TENKU = EnumHelper.addArmorMaterial
		("armor_material_tenku", 
		Reference.MOD_ID + ":tenku",
		12,
		new int[] {1,3,5,2},
		25,
		SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
		0.0f);


	//Crafting Items
	public static final Item CLOTH = new ItemBase("cloth");
	public static final Item CLOTH_STRIP = new ItemBase("cloth_strip");
	public static final Item LEATHER_PAD = new ItemBase("leather_pad");
	public static final Item LEATHER_STRIP = new ItemBase("leather_strip");
	public static final Item REINFORCED_CLOTH = new ItemBase("reinforced_cloth");
	
	//Armors
	//helmet=1,chest=1,legs=2,boots=1
		//Bikini Armor
	public static final Item BIKINI_CHEST = new ArmorBase("bikini_chest", ARMOR_MATERIAL_BIKINI, 1, EntityEquipmentSlot.CHEST);
	public static final Item BIKINI_LEGS = new ArmorBase("bikini_skirt", ARMOR_MATERIAL_BIKINI, 2, EntityEquipmentSlot.LEGS);
		//Metal Armor
	public static final Item METAL_CHEST = new ArmorBase("metal_chest",ARMOR_MATERIAL_METAL , 1, EntityEquipmentSlot.CHEST);
	public static final Item METAL_BOOTS = new ArmorBase("metal_boots",ARMOR_MATERIAL_METAL , 1, EntityEquipmentSlot.FEET);	
	public static final Item METAL_HEAD = new ArmorBase("metal_head",ARMOR_MATERIAL_METAL , 1, EntityEquipmentSlot.HEAD);
	public static final Item METAL_PANTS = new ArmorBase("metal_pants",ARMOR_MATERIAL_METAL , 2, EntityEquipmentSlot.LEGS);
		//Puratina Armor
	public static final Item PURATINA_CHEST = new ArmorBase("puratina_chest",ARMOR_MATERIAL_PURATINA , 1, EntityEquipmentSlot.CHEST);
	public static final Item PURATINA_BOOTS = new ArmorBase("puratina_boots",ARMOR_MATERIAL_PURATINA , 1, EntityEquipmentSlot.FEET);	
	public static final Item PURATINA_HEAD = new ArmorBase("puratina_head",ARMOR_MATERIAL_PURATINA , 1, EntityEquipmentSlot.HEAD);
		//Misuriru Armor
	public static final Item MISURIRU_CHEST = new ArmorBase("misuriru_chest",ARMOR_MATERIAL_MISURIRU , 1, EntityEquipmentSlot.CHEST);
	public static final Item MISURIRU_BOOTS = new ArmorBase("misuriru_boots",ARMOR_MATERIAL_MISURIRU , 1, EntityEquipmentSlot.FEET);	
	public static final Item MISURIRU_HEAD = new ArmorBase("misuriru_head",ARMOR_MATERIAL_MISURIRU , 1, EntityEquipmentSlot.HEAD);
		//Hagane Armor
	public static final Item HAGANE_CHEST = new ArmorBase("hagane_chest",ARMOR_MATERIAL_HAGANE , 1, EntityEquipmentSlot.CHEST);
	public static final Item HAGANE_BOOTS = new ArmorBase("hagane_boots",ARMOR_MATERIAL_HAGANE , 1, EntityEquipmentSlot.FEET);	
	public static final Item HAGANE_HEAD = new ArmorBase("hagane_head",ARMOR_MATERIAL_HAGANE , 1, EntityEquipmentSlot.HEAD);
	public static final Item HAGANE_PANTS = new ArmorBase("hagane_pants",ARMOR_MATERIAL_HAGANE , 2, EntityEquipmentSlot.LEGS);
		//RYUUKISI Armor
	public static final Item RYUUKISI_CHEST = new ArmorBase("ryuukisi_chest",ARMOR_MATERIAL_RYUUKISI , 1, EntityEquipmentSlot.CHEST);
	public static final Item RYUUKISI_BOOTS = new ArmorBase("ryuukisi_boots",ARMOR_MATERIAL_RYUUKISI , 1, EntityEquipmentSlot.FEET);	
	public static final Item RYUUKISI_HEAD = new ArmorBase("ryuukisi_head",ARMOR_MATERIAL_RYUUKISI , 1, EntityEquipmentSlot.HEAD);
		//tenku Armor
	public static final Item TENKU_CHEST = new ArmorBase("tenku_chest",ARMOR_MATERIAL_TENKU , 1, EntityEquipmentSlot.CHEST);
	public static final Item TENKU_BOOTS = new ArmorBase("tenku_boots",ARMOR_MATERIAL_TENKU , 1, EntityEquipmentSlot.FEET);	
	public static final Item TENKU_HEAD = new ArmorBase("tenku_head",ARMOR_MATERIAL_TENKU , 1, EntityEquipmentSlot.HEAD);

	
}
