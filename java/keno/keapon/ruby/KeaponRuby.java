package keno.keapon.ruby;

import keno.keapon.ruby.weapons.Wooden_Battleaxe;
import keno.keapon.ruby.weapons.Stone_Battleaxe;
import keno.keapon.ruby.weapons.Wooden_Axcalibur;
import keno.keapon.ruby.weapons.Golden_Battleaxe;
import keno.keapon.ruby.weapons.Half_Netherite_Axcalibur;
import keno.keapon.ruby.weapons.Iron_Axcalibur;
import keno.keapon.ruby.weapons.Iron_Battleaxe;
import keno.keapon.ruby.weapons.Netherite_Axcalibur;
import keno.keapon.ruby.weapons.Diamond_Axcalibur;
import keno.keapon.ruby.weapons.Diamond_Battleaxe;
import keno.keapon.ruby.weapons.Golden_Axcalibur;
import keno.keapon.ruby.weapons.Netherite_Battleaxe;
import keno.keapon.ruby.weapons.Rubied_Diamond_Battleaxe;
import keno.keapon.ruby.weapons.Rubied_Netherite_Battleaxe;
import keno.keapon.ruby.weapons.Ruby_Axcalibur;
import keno.keapon.ruby.weapons.Ruby_Battleaxe;
import keno.keapon.ruby.weapons.Stone_Axcalibur;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.GenerationStep;

public class KeaponRuby implements ModInitializer {

	public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Item COMPRESSED_RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));

	private static ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = Feature.ORE.configure
		(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, RUBY_ORE.getDefaultState(), 5))
		.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(8), YOffset.fixed(19))))).spreadHorizontally().repeat(4);

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("keaponruby", "ruby_ore"), RUBY_ORE);
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "ruby"), RUBY);
		Registry.register(Registry.BLOCK, new Identifier("keaponruby", "ruby_block"), RUBY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "compressed_ruby"), COMPRESSED_RUBY);
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "wooden_battleaxe"), new Wooden_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "stone_battleaxe"), new Stone_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "golden_battleaxe"), new Golden_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "iron_battleaxe"), new Iron_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "diamond_battleaxe"), new Diamond_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "netherite_battleaxe"), new Netherite_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "rubied_diamond_battleaxe"), new Rubied_Diamond_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "rubied_netherite_battleaxe"), new Rubied_Netherite_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "ruby_battleaxe"), new Ruby_Battleaxe(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "wooden_axcalibur"), new Wooden_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "stone_axcalibur"), new Stone_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "golden_axcalibur"), new Golden_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "iron_axcalibur"), new Iron_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "diamond_axcalibur"), new Diamond_Axcalibur (new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "netherite_axcalibur"), new Netherite_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "half_netherite_axcalibur"), new Half_Netherite_Axcalibur(new ToolMaterialFabric()));
		Registry.register(Registry.ITEM, new Identifier("keaponruby", "ruby_axcalibur"), new Ruby_Axcalibur(new ToolMaterialFabric()));
	
		RegistryKey<ConfiguredFeature<?,?>> rubyOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("keaponruby","ruby_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOreOverworld.getValue(), RUBY_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOreOverworld);
	}
}
