package com.shatteredpixel.shatteredpixeldungeon.windows;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.items.Amulet;
import com.shatteredpixel.shatteredpixeldungeon.items.Ankh;
import com.shatteredpixel.shatteredpixeldungeon.items.BrokenSeal;
import com.shatteredpixel.shatteredpixeldungeon.items.Generator;
import com.shatteredpixel.shatteredpixeldungeon.items.Honeypot;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.Stylus;
import com.shatteredpixel.shatteredpixeldungeon.items.Torch;
import com.shatteredpixel.shatteredpixeldungeon.items.Waterskin;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.ClothArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.LeatherArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.MailArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.PlateArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.ScaleArmor;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.AlchemistsToolkit;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.ChaliceOfBlood;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.CloakOfShadows;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.DriedRose;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.EtherealChains;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.HornOfPlenty;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.MasterThievesArmband;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.SandalsOfNature;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TalismanOfForesight;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.UnstableSpellbook;
import com.shatteredpixel.shatteredpixeldungeon.items.bombs.Bomb;
import com.shatteredpixel.shatteredpixeldungeon.items.food.Food;
import com.shatteredpixel.shatteredpixeldungeon.items.food.MeatPie;
import com.shatteredpixel.shatteredpixeldungeon.items.food.Pasty;
import com.shatteredpixel.shatteredpixeldungeon.items.food.SmallRation;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfExperience;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfHealing;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfHaste;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfInvisibility;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfLevitation;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfMindVision;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfParalyticGas;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfPurity;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfStrength;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfAccuracy;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfArcana;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfElements;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEnergy;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEvasion;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfForce;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfFuror;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfHaste;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfMight;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfSharpshooting;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfTenacity;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfWealth;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfIdentify;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfLullaby;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfMagicMapping;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfMirrorImage;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfRage;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfRecharging;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfRemoveCurse;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfRetribution;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfTeleportation;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfTerror;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfTransmutation;
import com.shatteredpixel.shatteredpixeldungeon.items.scrolls.ScrollOfUpgrade;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfBlastWave;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfCorruption;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfDisintegration;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfFireblast;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfFrost;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfLightning;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfLivingEarth;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfMagicMissile;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfPrismaticLight;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfRegrowth;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfTransfusion;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfWarding;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.RedButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.RenderedTextBlock;
import com.shatteredpixel.shatteredpixeldungeon.ui.ScrollPane;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.audio.Sample;
import com.watabou.noosa.ui.Component;
import com.watabou.utils.Reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WndGetItem extends Window {

	private static final int WIDTH = 130;
	private static final int HEIGHT = 180;
	private static final int BTN_HEIGHT = 18;
	private static final int GAP = 2;

	private ScrollPane pane;
	private Component content;

	public WndGetItem() {
		super();
		resize(WIDTH, HEIGHT);

		pane = new ScrollPane(new Component());
		add(pane);
		pane.setRect(0, 0, WIDTH, HEIGHT);
		content = pane.content();

		showCategories();
	}

	private void showCategories() {
		content.clear();

		RenderedTextBlock title = PixelScene.renderTextBlock("Select Category", 9);
		title.hardlight(TITLE_COLOR);
		title.setPos((WIDTH - title.width()) / 2, GAP);
		content.add(title);

		float pos = title.bottom() + 4;

		String[] categories = new String[]{
				"Weapons", "Armor", "Wands", "Rings",
				"Artifacts", "Potions", "Scrolls", "Food & Misc"
		};

		for (final String cat : categories) {
			RedButton btn = new RedButton(cat, 8) {
				@Override
				protected void onClick() {
					showItemsForCategory(cat);
				}
			};
			btn.setRect(GAP, pos, WIDTH - 2 * GAP, BTN_HEIGHT);
			content.add(btn);
			pos += BTN_HEIGHT + GAP;
		}

		content.setSize(WIDTH, pos + GAP);
		pane.scrollTo(0, 0);
	}

	private void showItemsForCategory(String category) {
		content.clear();

		RedButton btnBack = new RedButton("<- Back", 8) {
			@Override
			protected void onClick() {
				showCategories();
			}
		};
		btnBack.setRect(GAP, GAP, WIDTH - 2 * GAP, BTN_HEIGHT - 2);
		content.add(btnBack);

		float pos = btnBack.bottom() + 4;

		List<Class<? extends Item>> items = getItems(category);
		for (final Class<? extends Item> cl : items) {
			try {
				final Item sample = Reflection.newInstance(cl);
				RedButton btn = new RedButton(sample.title(), 7) {
					@Override
					protected void onClick() {
						spawnItem(cl);
					}
				};
				btn.icon(new ItemSprite(sample));
				btn.setRect(GAP, pos, WIDTH - 2 * GAP, BTN_HEIGHT);
				content.add(btn);
				pos += BTN_HEIGHT + GAP;
			} catch (Exception ignored) {}
		}

		content.setSize(WIDTH, pos + GAP);
		pane.scrollTo(0, 0);
	}

	private void spawnItem(Class<? extends Item> cl) {
		if (Dungeon.hero == null) return;
		Item item = Reflection.newInstance(cl);
		if (item == null) return;
		item.identify();
		if (!item.collect()) {
			Dungeon.level.drop(item, Dungeon.hero.pos);
		}
		Sample.INSTANCE.play(Assets.Sounds.ITEM);
		hide();
	}

	@SuppressWarnings("unchecked")
	private List<Class<? extends Item>> getItems(String category) {
		List<Class<? extends Item>> list = new ArrayList<>();
		switch (category) {
			case "Weapons":
				for (Class<?> c : Generator.Category.WEP_T1.classes) list.add((Class<? extends Item>) c);
				for (Class<?> c : Generator.Category.WEP_T2.classes) list.add((Class<? extends Item>) c);
				for (Class<?> c : Generator.Category.WEP_T3.classes) list.add((Class<? extends Item>) c);
				for (Class<?> c : Generator.Category.WEP_T4.classes) list.add((Class<? extends Item>) c);
				for (Class<?> c : Generator.Category.WEP_T5.classes) list.add((Class<? extends Item>) c);
				break;
			case "Armor":
				list.add(ClothArmor.class);
				list.add(LeatherArmor.class);
				list.add(MailArmor.class);
				list.add(ScaleArmor.class);
				list.add(PlateArmor.class);
				break;
			case "Wands":
				list.addAll(Arrays.asList(
						WandOfMagicMissile.class, WandOfLightning.class, WandOfDisintegration.class,
						WandOfFireblast.class, WandOfFrost.class, WandOfPrismaticLight.class,
						WandOfBlastWave.class, WandOfLivingEarth.class, WandOfWarding.class,
						WandOfTransfusion.class, WandOfCorruption.class, WandOfRegrowth.class
				));
				break;
			case "Rings":
				list.addAll(Arrays.asList(
						RingOfMight.class, RingOfHaste.class, RingOfFuror.class,
						RingOfSharpshooting.class, RingOfArcana.class, RingOfTenacity.class,
						RingOfEvasion.class, RingOfAccuracy.class, RingOfEnergy.class,
						RingOfWealth.class, RingOfElements.class, RingOfForce.class
				));
				break;
			case "Artifacts":
				list.addAll(Arrays.asList(
						CloakOfShadows.class, HornOfPlenty.class, ChaliceOfBlood.class,
						MasterThievesArmband.class, TimekeepersHourglass.class, AlchemistsToolkit.class,
						UnstableSpellbook.class, EtherealChains.class, TalismanOfForesight.class,
						DriedRose.class, SandalsOfNature.class
				));
				break;
			case "Potions":
				list.addAll(Arrays.asList(
						PotionOfHealing.class, PotionOfStrength.class, PotionOfInvisibility.class,
						PotionOfExperience.class, PotionOfPurity.class, PotionOfMindVision.class,
						PotionOfHaste.class, PotionOfLevitation.class, PotionOfParalyticGas.class
				));
				break;
			case "Scrolls":
				list.addAll(Arrays.asList(
						ScrollOfUpgrade.class, ScrollOfIdentify.class, ScrollOfRemoveCurse.class,
						ScrollOfMagicMapping.class, ScrollOfTeleportation.class, ScrollOfRecharging.class,
						ScrollOfTransmutation.class, ScrollOfMirrorImage.class, ScrollOfLullaby.class,
						ScrollOfRage.class, ScrollOfTerror.class, ScrollOfRetribution.class
				));
				break;
			case "Food & Misc":
				list.addAll(Arrays.asList(
						Food.class, SmallRation.class, Pasty.class, MeatPie.class,
						Torch.class, Stylus.class, Ankh.class, Honeypot.class,
						Waterskin.class, BrokenSeal.class, Bomb.class, Amulet.class
				));
				break;
		}
		return list;
	}
}
