package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class CustomCore2018 extends ExpansionSet {

    private static final CustomCore2018 instance = new CustomCore2018();

    public static CustomCore2018 getInstance() {
        return instance;
    }

    private CustomCore2018() {
        super("Custom Core 2018", "CC18", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = false;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Accorder Paladin", 1, Rarity.UNCOMMON, mage.cards.a.AccorderPaladin.class));
        cards.add(new SetCardInfo("Angel of Mercy", 2, Rarity.COMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Angelic Vindicator", 3, Rarity.RARE, mage.cards.a.AngelicVindicator.class));
        cards.add(new SetCardInfo("Angelic Wall", 4, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        // Archangel of Salvation
        cards.add(new SetCardInfo("Attended Knight", 6, Rarity.COMMON, mage.cards.a.AttendedKnight.class));
        cards.add(new SetCardInfo("Auramancer", 7, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Aven Stormblade", 8, Rarity.COMMON, mage.cards.a.AvenStormblade.class));
        cards.add(new SetCardInfo("Battle Mastery", 9, Rarity.UNCOMMON, mage.cards.b.BattleMastery.class));
        cards.add(new SetCardInfo("Blinding Mage", 10, Rarity.UNCOMMON, mage.cards.b.BlindingMage.class));
        cards.add(new SetCardInfo("Boonfeather Crane", 11, Rarity.UNCOMMON, mage.cards.b.BoonfeatherCrane.class));
        cards.add(new SetCardInfo("Cavalry Vanguard", 12, Rarity.COMMON, mage.cards.c.CavalryVanguard.class));
        cards.add(new SetCardInfo("Dawnherald Cleric", 13, Rarity.COMMON, mage.cards.d.DawnheraldCleric.class));
        cards.add(new SetCardInfo("Demystify", 14, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Divine Favor", 15, Rarity.COMMON, mage.cards.d.DivineFavor.class));
        cards.add(new SetCardInfo("Final Verdict", 16, Rarity.RARE, mage.cards.f.FinalVerdict.class));
        cards.add(new SetCardInfo("Graceful Cavalier", 17, Rarity.UNCOMMON, mage.cards.g.GracefulCavalier.class));
        // Guiding Spirits
        cards.add(new SetCardInfo("Immolating Glare", 19, Rarity.UNCOMMON, mage.cards.i.ImmolatingGlare.class));
        // Imperial Banneret
        cards.add(new SetCardInfo("Knight Errant", 21, Rarity.COMMON, mage.cards.k.KnightErrant.class));
        cards.add(new SetCardInfo("Knight Watch", 22, Rarity.COMMON, mage.cards.k.KnightWatch.class));
        cards.add(new SetCardInfo("Leonin Snarecaster", 23, Rarity.COMMON, mage.cards.l.LeoninSnarecaster.class));
        cards.add(new SetCardInfo("Marked by Honor", 24, Rarity.COMMON, mage.cards.m.MarkedByHonor.class));
        cards.add(new SetCardInfo("Niala, Guide of Lost Souls", 25, Rarity.RARE, mage.cards.n.NialaGuideOfLostSouls.class));
        cards.add(new SetCardInfo("Pacifism", 26, Rarity.COMMON, mage.cards.p.Pacifism.class));
        // People's Chamion
        cards.add(new SetCardInfo("Raise the Alarm", 28, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Repel the Darkness", 29, Rarity.COMMON, mage.cards.r.RepelTheDarkness.class));
        // Runeblade Knight
        cards.add(new SetCardInfo("Saintly Purifier", 31, Rarity.RARE, mage.cards.s.SaintlyPurifier.class));
        cards.add(new SetCardInfo("Seal of Judgment", 32, Rarity.UNCOMMON, mage.cards.s.SealOfJudgment.class));
        cards.add(new SetCardInfo("Seeker of the Way", 33, Rarity.UNCOMMON, mage.cards.s.SeekerOfTheWay.class));
        cards.add(new SetCardInfo("Serene Meditation", 34, Rarity.COMMON, mage.cards.s.SereneMeditation.class));
        cards.add(new SetCardInfo("Serra Angel", 35, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Sheltering Light", 36, Rarity.COMMON, mage.cards.s.ShelteringLight.class));
        cards.add(new SetCardInfo("Sunfeather Swallow", 37, Rarity.COMMON, mage.cards.s.SunfeatherSwallow.class));
        cards.add(new SetCardInfo("Vaen, Will of Law", 38, Rarity.MYTHIC, mage.cards.v.VaenWillOfLaw.class));
        cards.add(new SetCardInfo("Anticipate", 39, Rarity.COMMON, mage.cards.a.Anticipate.class));
        cards.add(new SetCardInfo("Auspicial Sphinx", 40, Rarity.RARE, mage.cards.a.AuspicialSphinx.class));
        // Change of Plans
        cards.add(new SetCardInfo("Cloaked Siren", 42, Rarity.COMMON, mage.cards.c.CloakedSiren.class));
        cards.add(new SetCardInfo("Clone", 43, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Convolute", 44, Rarity.COMMON, mage.cards.c.Convolute.class));
        cards.add(new SetCardInfo("Covert Agent", 45, Rarity.COMMON, mage.cards.c.CovertAgent.class));
        cards.add(new SetCardInfo("Crippling Chill", 46, Rarity.COMMON, mage.cards.c.CripplingChill.class));
        cards.add(new SetCardInfo("Deep Reflection", 47, Rarity.UNCOMMON, mage.cards.d.DeepReflection.class));
        cards.add(new SetCardInfo("Deepwater Serpent", 48, Rarity.COMMON, mage.cards.d.DeepwaterSerpent.class));
        cards.add(new SetCardInfo("Disperse", 49, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Dissipate", 50, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Divination", 51, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Frost Drake", 52, Rarity.UNCOMMON, mage.cards.f.FrostDrake.class));
        cards.add(new SetCardInfo("Inquisitive Vedalken", 53, Rarity.COMMON, mage.cards.i.InquisitiveVedalken.class));
        cards.add(new SetCardInfo("Jeskai Preserver", 54, Rarity.UNCOMMON, mage.cards.j.JeskaiPreserver.class));
        cards.add(new SetCardInfo("Jeskai Wanderer", 55, Rarity.COMMON, mage.cards.j.JeskaiWanderer.class));
        cards.add(new SetCardInfo("Kraken Hatchling", 56, Rarity.COMMON, mage.cards.k.KrakenHatchling.class));
        cards.add(new SetCardInfo("Master of Ancient Texts", 57, Rarity.UNCOMMON, mage.cards.m.MasterOfAncientTexts.class));
        cards.add(new SetCardInfo("Merfolk Roilmage", 58, Rarity.COMMON, mage.cards.m.MerfolkRoilmage.class));
        cards.add(new SetCardInfo("Mind Control", 59, Rarity.RARE, mage.cards.m.MindControl.class));
        cards.add(new SetCardInfo("Mistweaver Monk", 60, Rarity.RARE, mage.cards.m.MistweaverMonk.class));
        cards.add(new SetCardInfo("Mnemonic Wall", 61, Rarity.COMMON, mage.cards.m.MnemonicWall.class));
        cards.add(new SetCardInfo("Negate", 62, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Overwhelming Portents", 63, Rarity.UNCOMMON, mage.cards.o.OverwhelmingPortents.class));
        cards.add(new SetCardInfo("Seize Tomorrow", 64, Rarity.MYTHIC, mage.cards.s.SeizeTomorrow.class));
        cards.add(new SetCardInfo("Sensory Deprivation", 65, Rarity.COMMON, mage.cards.s.SensoryDeprivation.class));
        cards.add(new SetCardInfo("Sleep Paralysis", 66, Rarity.COMMON, mage.cards.s.SleepParalysis.class));
        cards.add(new SetCardInfo("Spectral Flight", 67, Rarity.COMMON, mage.cards.s.SpectralFlight.class));
        cards.add(new SetCardInfo("Tamiyo, the Moon Sage", 68, Rarity.MYTHIC, mage.cards.t.TamiyoTheMoonSage.class));
        cards.add(new SetCardInfo("Tidal Elemental", 69, Rarity.COMMON, mage.cards.t.TidalElemental.class));
        cards.add(new SetCardInfo("Tigal, Grandmaster", 70, Rarity.RARE, mage.cards.t.TigalGrandmaster.class));
        cards.add(new SetCardInfo("Turn to Frog", 71, Rarity.UNCOMMON, mage.cards.t.TurnToFrog.class));
        cards.add(new SetCardInfo("Wall of Frost", 72, Rarity.UNCOMMON, mage.cards.w.WallOfFrost.class));
        cards.add(new SetCardInfo("Wash Away", 73, Rarity.UNCOMMON, mage.cards.w.WashAway.class));
        cards.add(new SetCardInfo("Water Servant", 74, Rarity.UNCOMMON, mage.cards.w.WaterServant.class));
        cards.add(new SetCardInfo("Wavecrash Leviathan", 75, Rarity.RARE, mage.cards.w.WavecrashLeviathan.class));
        cards.add(new SetCardInfo("Welkin Tern", 76, Rarity.COMMON, mage.cards.w.WelkinTern.class));
        cards.add(new SetCardInfo("Altar's Reap", 77, Rarity.COMMON, mage.cards.a.AltarsReap.class));
        cards.add(new SetCardInfo("Anguish", 78, Rarity.UNCOMMON, mage.cards.a.Anguish.class));
        cards.add(new SetCardInfo("Avaricious Demon", 79, Rarity.RARE, mage.cards.a.AvariciousDemon.class));
        cards.add(new SetCardInfo("Bal'anak, Dreadlord", 80, Rarity.RARE, mage.cards.b.BalanakDreadlord.class));
        cards.add(new SetCardInfo("Beckon the Horde", 81, Rarity.COMMON, mage.cards.b.BeckonTheHorde.class));
        cards.add(new SetCardInfo("Blood Bairn", 82, Rarity.COMMON, mage.cards.b.BloodBairn.class));
        // Bloodknight Countess
        cards.add(new SetCardInfo("Carrion Crow", 84, Rarity.COMMON, mage.cards.c.CarrionCrow.class));
        cards.add(new SetCardInfo("Child of Night", 85, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Condemned Brute", 86, Rarity.COMMON, mage.cards.c.CondemnedBrute.class));
        cards.add(new SetCardInfo("Cruel Impalement", 87, Rarity.COMMON, mage.cards.c.CruelImpalement.class));
        cards.add(new SetCardInfo("Dark Revival", 88, Rarity.RARE, mage.cards.d.DarkRevival.class));
        // Deathplague
        cards.add(new SetCardInfo("Diabolic Tutor", 90, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Duress", 91, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Falkenrath Noble", 92, Rarity.UNCOMMON, mage.cards.f.FalkenrathNoble.class));
        cards.add(new SetCardInfo("Fallen Aristocrat", 93, Rarity.COMMON, mage.cards.f.FallenAristocrat.class));
        cards.add(new SetCardInfo("Gravedigger", 94, Rarity.UNCOMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Grim Necromancer", 95, Rarity.UNCOMMON, mage.cards.g.GrimNecromancer.class));
        // Grisly Amalgam
        // Keeper of Dark Secrets
        cards.add(new SetCardInfo("Looming Husk", 98, Rarity.COMMON, mage.cards.l.LoomingHusk.class));
        cards.add(new SetCardInfo("Marsh Snake", 99, Rarity.COMMON, mage.cards.m.MarshSnake.class));
        cards.add(new SetCardInfo("Memoricide", 100, Rarity.RARE, mage.cards.m.Memoricide.class));
        cards.add(new SetCardInfo("Mind Rot", 101, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Murder", 102, Rarity.UNCOMMON, mage.cards.m.Murder.class));
        cards.add(new SetCardInfo("Prospective Host", 103, Rarity.COMMON, mage.cards.p.ProspectiveHost.class));
        cards.add(new SetCardInfo("Raise Dead", 104, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Sengir Vampire", 105, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Shadowcloak Vampire", 106, Rarity.COMMON, mage.cards.s.ShadowcloakVampire.class));
        cards.add(new SetCardInfo("Siphon Essence", 107, Rarity.UNCOMMON, mage.cards.s.SiphonEssence.class));
        // Sorin, Lord of Vengeance
        cards.add(new SetCardInfo("Sorin's Thirst", 109, Rarity.COMMON, mage.cards.s.SorinsThirst.class));
        // Tireless Dead
        // Undying Will
        // Vampiric Confidant
        cards.add(new SetCardInfo("Vengeful Sadist", 113, Rarity.COMMON, mage.cards.v.VengefulSadist.class));
        cards.add(new SetCardInfo("Zof Shade", 114, Rarity.COMMON, mage.cards.z.ZofShade.class));
        cards.add(new SetCardInfo("Act of Treason", 115, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        cards.add(new SetCardInfo("Battlehardened Minotaur", 116, Rarity.COMMON, mage.cards.b.BattlehardenedMinotaur.class));
        cards.add(new SetCardInfo("Boomkeg Runner", 117, Rarity.COMMON, mage.cards.b.BoomkegRunner.class));
        cards.add(new SetCardInfo("Borderland Marauder", 118, Rarity.COMMON, mage.cards.b.BorderlandMarauder.class));
        cards.add(new SetCardInfo("Brimstone Volley", 119, Rarity.COMMON, mage.cards.b.BrimstoneVolley.class));
        // Burning Desire
        cards.add(new SetCardInfo("Calamitous Ruin", 121, Rarity.UNCOMMON, mage.cards.c.CalamitousRuin.class));
        cards.add(new SetCardInfo("Final Flame", 122, Rarity.RARE, mage.cards.f.FinalFlame.class));
        cards.add(new SetCardInfo("Flameblast", 123, Rarity.COMMON, mage.cards.f.Flameblast.class));
        cards.add(new SetCardInfo("Goblin Pyromaniac", 124, Rarity.COMMON, mage.cards.g.GoblinPyromaniac.class));
        cards.add(new SetCardInfo("Goblin Ragemonger", 152, Rarity.RARE, mage.cards.g.GoblinRagemonger.class));
        cards.add(new SetCardInfo("Goblin War Paint", 126, Rarity.COMMON, mage.cards.g.GoblinWarPaint.class));
        cards.add(new SetCardInfo("Hellkite Patriarch", 127, Rarity.RARE, mage.cards.h.HellkitePatriarch.class));
        // Ignite Revelation
        cards.add(new SetCardInfo("Innerflame Initiate", 129, Rarity.COMMON, mage.cards.i.InnerflameInitiate.class));
        cards.add(new SetCardInfo("Innerflame Master", 130, Rarity.UNCOMMON, mage.cards.i.InnerflameMaster.class));
        cards.add(new SetCardInfo("Ironhide Disciple", 131, Rarity.UNCOMMON, mage.cards.i.IronhideDisciple.class));
        // Kharoum, Ragefire Chieftain
        cards.add(new SetCardInfo("Koth, Fury of Kuldotha", 133, Rarity.MYTHIC, mage.cards.k.KothFuryOfKuldotha.class));
        cards.add(new SetCardInfo("Lava Axe", 134, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Linebreaker Giant", 135, Rarity.COMMON, mage.cards.l.LinebreakerGiant.class));
        // Massive Eruption
        cards.add(new SetCardInfo("Minotaur Skullcleaver", 137, Rarity.COMMON, mage.cards.m.MinotaurSkullcleaver.class));
        cards.add(new SetCardInfo("Orcish Hordechief", 138, Rarity.RARE, mage.cards.o.OrcishHordechief.class));
        cards.add(new SetCardInfo("Orcish Marauder", 139, Rarity.UNCOMMON, mage.cards.o.OrcishMarauder.class));
        cards.add(new SetCardInfo("Pinnacle of Rage", 140, Rarity.UNCOMMON, mage.cards.p.PinnacleOfRage.class));
        cards.add(new SetCardInfo("Rabid Wargs", 141, Rarity.COMMON, mage.cards.r.RabidWargs.class));
        cards.add(new SetCardInfo("Riot Devils", 142, Rarity.COMMON, mage.cards.r.RiotDevils.class));
        cards.add(new SetCardInfo("Ruinbringer", 143, Rarity.UNCOMMON, mage.cards.r.Ruinbringer.class));
        cards.add(new SetCardInfo("Savage Swordsman", 144, Rarity.UNCOMMON, mage.cards.s.SavageSwordsman.class));
        cards.add(new SetCardInfo("Sigiled Skink", 145, Rarity.COMMON, mage.cards.s.SigiledSkink.class));
        cards.add(new SetCardInfo("Smelt", 146, Rarity.COMMON, mage.cards.s.Smelt.class));
        cards.add(new SetCardInfo("Sure Strike", 147, Rarity.COMMON, mage.cards.s.SureStrike.class));
        cards.add(new SetCardInfo("Tormenting Voice", 148, Rarity.COMMON, mage.cards.t.TormentingVoice.class));
        cards.add(new SetCardInfo("Trumpet Blast", 149, Rarity.COMMON, mage.cards.t.TrumpetBlast.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 150, Rarity.UNCOMMON, mage.cards.v.VolcanicDragon.class));
        cards.add(new SetCardInfo("Wake of Flames", 151, Rarity.UNCOMMON, mage.cards.w.WakeOfFlames.class));
        // Wild Imagination
        cards.add(new SetCardInfo("Acidic Slime", 153, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        // Awakened Earth
        cards.add(new SetCardInfo("Barkskin", 155, Rarity.COMMON, mage.cards.b.Barkskin.class));
        cards.add(new SetCardInfo("Bond Beetle", 156, Rarity.COMMON, mage.cards.b.BondBeetle.class));
        cards.add(new SetCardInfo("Borderland Ranger", 157, Rarity.COMMON, mage.cards.b.BorderlandRanger.class));
        cards.add(new SetCardInfo("Briarpack Alpha", 158, Rarity.UNCOMMON, mage.cards.b.BriarpackAlpha.class));
        // CC18:Voracious Hydra
        cards.add(new SetCardInfo("Centaur Courser", 160, Rarity.COMMON, mage.cards.c.CentaurCourser.class));
        cards.add(new SetCardInfo("Charging Primadox", 161, Rarity.RARE, mage.cards.c.ChargingPrimadox.class));
        cards.add(new SetCardInfo("Colossal Wurm", 162, Rarity.COMMON, mage.cards.c.ColossalWurm.class));
        cards.add(new SetCardInfo("Cultivate", 163, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Elvish Visionary", 164, Rarity.COMMON, mage.cards.e.ElvishVisionary.class));
        cards.add(new SetCardInfo("Feral Bear", 165, Rarity.COMMON, mage.cards.f.FeralBear.class));
        cards.add(new SetCardInfo("Garruk Wildspeaker", 166, Rarity.MYTHIC, mage.cards.g.GarrukWildspeaker.class));
        cards.add(new SetCardInfo("Giant Spider", 167, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Gravetiller Wurm", 168, Rarity.UNCOMMON, mage.cards.g.GravetillerWurm.class));
        cards.add(new SetCardInfo("Greater Basilisk", 169, Rarity.COMMON, mage.cards.g.GreaterBasilisk.class));
        cards.add(new SetCardInfo("Indomitable Charge", 170, Rarity.UNCOMMON, mage.cards.i.IndomitableCharge.class));
        cards.add(new SetCardInfo("Kalonian Tusker", 171, Rarity.UNCOMMON, mage.cards.k.KalonianTusker.class));
        cards.add(new SetCardInfo("Mosshide Baloth", 172, Rarity.COMMON, mage.cards.m.MosshideBaloth.class));
        cards.add(new SetCardInfo("Naturalize", 173, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Nature's Majesty", 174, Rarity.UNCOMMON, mage.cards.n.NaturesMajesty.class));
        cards.add(new SetCardInfo("Obstinate Baloth", 175, Rarity.RARE, mage.cards.o.ObstinateBaloth.class));
        cards.add(new SetCardInfo("Plummet", 176, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Prey Upon", 177, Rarity.COMMON, mage.cards.p.PreyUpon.class));
        // Primal Insight
        cards.add(new SetCardInfo("Ranger's Guile", 179, Rarity.COMMON, mage.cards.r.RangersGuile.class));
        cards.add(new SetCardInfo("Rumbling Baloth", 181, Rarity.COMMON, mage.cards.r.RumblingBaloth.class));
        cards.add(new SetCardInfo("Skysnare Spider", 182, Rarity.UNCOMMON, mage.cards.s.SkysnareSpider.class));
        cards.add(new SetCardInfo("Speaker of Destinies", 183, Rarity.COMMON, mage.cards.s.SpeakerOfDestinies.class));
        cards.add(new SetCardInfo("Stalking Spider", 184, Rarity.UNCOMMON, mage.cards.s.StalkingSpider.class));
        cards.add(new SetCardInfo("Sylvan Primalist", 185, Rarity.COMMON, mage.cards.s.SylvanPrimalist.class));
        cards.add(new SetCardInfo("Sylvan Ritualist", 186, Rarity.RARE, mage.cards.s.SylvanRitualist.class));
        cards.add(new SetCardInfo("Titanic Growth", 187, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Vicious Instinct", 188, Rarity.UNCOMMON, mage.cards.v.ViciousInstinct.class));
        cards.add(new SetCardInfo("Wrathvine", 189, Rarity.UNCOMMON, mage.cards.w.Wrathvine.class));
        // Xythara, Widow Queen
        // Aethermaw Dragon
        cards.add(new SetCardInfo("Arcane Discharge", 192, Rarity.UNCOMMON, mage.cards.a.ArcaneDischarge.class));
        cards.add(new SetCardInfo("Blooddrenched Returned", 193, Rarity.RARE, mage.cards.b.BlooddrenchedReturned.class));
        cards.add(new SetCardInfo("Consuming Horde", 194, Rarity.UNCOMMON, mage.cards.c.ConsumingHorde.class));
        cards.add(new SetCardInfo("Cunning Nightblade", 195, Rarity.UNCOMMON, mage.cards.c.CunningNightblade.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 196, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Divert Aggression", 197, Rarity.UNCOMMON, mage.cards.d.DivertAggression.class));
        cards.add(new SetCardInfo("Druid of the Pack", 198, Rarity.RARE, mage.cards.d.DruidOfThePack.class));
        cards.add(new SetCardInfo("Duskblade Champion", 199, Rarity.RARE, mage.cards.d.DuskbladeChampion.class));
        cards.add(new SetCardInfo("Elvish Spiritcaller", 200, Rarity.UNCOMMON, mage.cards.e.ElvishSpiritcaller.class));
        // Enlightened Aesetic
        cards.add(new SetCardInfo("Notion Thief", 202, Rarity.RARE, mage.cards.n.NotionThief.class));
        cards.add(new SetCardInfo("Preserve Harmony", 203, Rarity.UNCOMMON, mage.cards.p.PreserveHarmony.class));
        // Prognostication
        cards.add(new SetCardInfo("Ragefire Shaman", 205, Rarity.UNCOMMON, mage.cards.r.RagefireShaman.class));
        // Razorvine Abomination
        // Soul of Aenyr
        cards.add(new SetCardInfo("Soul of Jannada", 208, Rarity.MYTHIC, mage.cards.s.SoulOfJannada.class));
        // Soul of Karsus
        cards.add(new SetCardInfo("Soul of Lorado", 210, Rarity.MYTHIC, mage.cards.s.SoulOfLorado.class));
        cards.add(new SetCardInfo("Soul of Netropolis", 211, Rarity.MYTHIC, mage.cards.s.SoulOfNetropolis.class));
        cards.add(new SetCardInfo("Titanic Crusher", 212, Rarity.RARE, mage.cards.t.TitanicCrusher.class));
        cards.add(new SetCardInfo("Triumphant Battleseraph", 213, Rarity.RARE, mage.cards.t.TriumphantBattleseraph.class));
        cards.add(new SetCardInfo("Twilight Paladin", 214, Rarity.UNCOMMON, mage.cards.t.TwilightPaladin.class));
        cards.add(new SetCardInfo("Warleader's Helix", 215, Rarity.UNCOMMON, mage.cards.w.WarleadersHelix.class));
        cards.add(new SetCardInfo("Burnished Hart", 216, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Cobbled Wings", 217, Rarity.COMMON, mage.cards.c.CobbledWings.class));
        cards.add(new SetCardInfo("Demonmail Hauberk", 218, Rarity.UNCOMMON, mage.cards.d.DemonmailHauberk.class));
        cards.add(new SetCardInfo("Emerald Soulstone", 219,  Rarity.UNCOMMON, mage.cards.e.EmeraldSoulstone.class));
        cards.add(new SetCardInfo("Guardian Automaton", 220, Rarity.COMMON, mage.cards.g.GuardianAutomaton.class));
        cards.add(new SetCardInfo("Jet Soulstone", 221, Rarity.UNCOMMON, mage.cards.j.JetSoulstone.class));
        cards.add(new SetCardInfo("Lumbering Colossus", 222, Rarity.UNCOMMON, mage.cards.l.LumberingColossus.class));
        cards.add(new SetCardInfo("Ornate Battle-Mace", 223, Rarity.COMMON, mage.cards.o.OrnateBattleMace.class));
        cards.add(new SetCardInfo("Pearl Soulstone", 224, Rarity.UNCOMMON, mage.cards.p.PearlSoulstone.class));
        cards.add(new SetCardInfo("Pithing Needle", 225, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Prophetic Prism", 226, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Rod of Seasons", 227, Rarity.RARE, mage.cards.r.RodOfSeasons.class));
        cards.add(new SetCardInfo("Ruby Soulstone", 228, Rarity.UNCOMMON, mage.cards.r.RubySoulstone.class));
        cards.add(new SetCardInfo("Sapphire Soulstone", 229, Rarity.UNCOMMON, mage.cards.s.SapphireSoulstone.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 230, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Tormod's Crypt", 231, Rarity.UNCOMMON, mage.cards.t.TormodsCrypt.class));
        // Unholy Sacrament
        cards.add(new SetCardInfo("Cinder Barrens", 233, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("Dragonskull Summit", 234, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Drowned Catacomb", 235, Rarity.RARE, mage.cards.d.DrownedCatacomb.class));
        cards.add(new SetCardInfo("Forsaken Sanctuary", 236, Rarity.UNCOMMON, mage.cards.f.ForsakenSanctuary.class));
        cards.add(new SetCardInfo("Foul Orchard", 237, Rarity.UNCOMMON, mage.cards.f.FoulOrchard.class));
        cards.add(new SetCardInfo("Glacial Fortress", 238, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Highland Lake", 239, Rarity.UNCOMMON, mage.cards.h.HighlandLake.class));
        cards.add(new SetCardInfo("Meandering River", 240, Rarity.UNCOMMON, mage.cards.m.MeanderingRiver.class));
        cards.add(new SetCardInfo("Rootbound Crag", 241, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Stone Quarry", 242, Rarity.UNCOMMON, mage.cards.s.StoneQuarry.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 243, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 244, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 245, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Timber Gorge", 246, Rarity.UNCOMMON, mage.cards.t.TimberGorge.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 247, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Unknown Shores", 248, Rarity.COMMON, mage.cards.u.UnknownShores.class));
        cards.add(new SetCardInfo("Woodland Stream", 249, Rarity.UNCOMMON, mage.cards.w.WoodlandStream.class));
    }
}
