package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author Fenhl
 */
public final class Netropolis extends ExpansionSet {
    private static final Netropolis instance = new Netropolis();

    public static Netropolis getInstance() { return instance; }

    private Netropolis() {
        super("Netropolis", "NET", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //cards.add(new SetCardInfo("Arms Merchant", 1, Rarity.UNCOMMON, mage.cards.a.ArmsMerchant.class));
        //cards.add(new SetCardInfo("Atares Amplifier", 2, Rarity.RARE, mage.cards.a.AtaresAmplifier.class));
        //cards.add(new SetCardInfo("Back in Action", 3, Rarity.UNCOMMON, mage.cards.b.BackInAction.class));
        //cards.add(new SetCardInfo("Battle Ready", 4, Rarity.COMMON, mage.cards.b.BattleReady.class));
        //cards.add(new SetCardInfo("Battle Tested", 5, Rarity.COMMON, mage.cards.b.BattleTested.class));
        //cards.add(new SetCardInfo("Citizen Programming", 6, Rarity.COMMON, mage.cards.c.CitizenProgramming.class));
        //cards.add(new SetCardInfo("Council Attendants", 7, Rarity.COMMON, mage.cards.c.CouncilAttendants.class));
        //cards.add(new SetCardInfo("Cymurai Blademaster", 8, Rarity.RARE, mage.cards.c.CymuraiBlademaster.class));
        //cards.add(new SetCardInfo("District Raid", 9, Rarity.COMMON, mage.cards.d.DistrictRaid.class));
        //cards.add(new SetCardInfo("Dominator Droid", 10, Rarity.MYTHIC, mage.cards.d.DominatorDroid.class));
        //cards.add(new SetCardInfo("Force Deployment", 11, Rarity.COMMON, mage.cards.f.ForceDeployment.class));
        //cards.add(new SetCardInfo("Freedom Fighters", 12, Rarity.COMMON, mage.cards.f.FreedomFighters.class));
        //cards.add(new SetCardInfo("L3-T, Equalizer", 13, Rarity.MYTHIC, mage.cards.l.L3TEqualizer.class));
        //cards.add(new SetCardInfo("Liberated Armory", 14, Rarity.RARE, mage.cards.l.LiberatedArmory.class));
        //cards.add(new SetCardInfo("Martial Dictate", 15, Rarity.RARE, mage.cards.m.MartialDictate.class));
        //cards.add(new SetCardInfo("Mecha Technician", 16, Rarity.COMMON, mage.cards.m.MechaTechnician.class));
        //cards.add(new SetCardInfo("N-FORCE Captain", 17, Rarity.UNCOMMON, mage.cards.n.NForceCaptain.class));
        //cards.add(new SetCardInfo("N-FORCE Trooper", 18, Rarity.COMMON, mage.cards.n.NForceTrooper.class));
        //cards.add(new SetCardInfo("New World Order", 19, Rarity.MYTHIC, mage.cards.n.NewWorldOrder.class));
        //cards.add(new SetCardInfo("Overwatch Droid", 20, Rarity.COMMON, mage.cards.o.OverwatchDroid.class));
        //cards.add(new SetCardInfo("Parameter Halo", 21, Rarity.UNCOMMON, mage.cards.p.ParameterHalo.class));
        cards.add(new SetCardInfo("Peacekeeper Droid", 22, Rarity.COMMON, mage.cards.p.PeacekeeperDroid.class));
        //cards.add(new SetCardInfo("Police Discretion", 23, Rarity.UNCOMMON, mage.cards.p.PoliceDiscretion.class));
        //cards.add(new SetCardInfo("Precog Pilot", 24, Rarity.UNCOMMON, mage.cards.p.PrecogPilot.class));
        //cards.add(new SetCardInfo("Psychic Obligator", 25, Rarity.UNCOMMON, mage.cards.p.PsychicObligator.class));
        //cards.add(new SetCardInfo("Public Broadcast", 26, Rarity.COMMON, mage.cards.p.PublicBroadcast.class));
        //cards.add(new SetCardInfo("Rebel Advance", 27, Rarity.UNCOMMON, mage.cards.r.RebelAdvance.class));
        //cards.add(new SetCardInfo("Rebel Sniper", 28, Rarity.UNCOMMON, mage.cards.r.RebelSniper.class));
        //cards.add(new SetCardInfo("Rocketeer", 29, Rarity.COMMON, mage.cards.r.Rocketeer.class));
        //cards.add(new SetCardInfo("Rooftop Rebel", 30, Rarity.COMMON, mage.cards.r.RooftopRebel.class));
        //cards.add(new SetCardInfo("Scion Mark IV", 31, Rarity.COMMON, mage.cards.s.ScionMarkIv.class));
        //cards.add(new SetCardInfo("Skilled Protector", 32, Rarity.COMMON, mage.cards.s.SkilledProtector.class));
        //cards.add(new SetCardInfo("Sonic Scream", 33, Rarity.COMMON, mage.cards.s.SonicScream.class));
        //cards.add(new SetCardInfo("Sovereign Droid", 34, Rarity.UNCOMMON, mage.cards.s.SovereignDroid.class));
        //cards.add(new SetCardInfo("Sting Droid", 35, Rarity.COMMON, mage.cards.s.StingDroid.class));
        //cards.add(new SetCardInfo("Taken for Questioning", 36, Rarity.RARE, mage.cards.t.TakenForQuestioning.class));
        //cards.add(new SetCardInfo("Theos Artene, Demagogue", 37, Rarity.RARE, mage.cards.t.TheosArteneDemagogue.class));
        //cards.add(new SetCardInfo("TR-12 Deliverer", 38, Rarity.UNCOMMON, mage.cards.t.Tr12Deliverer.class));
        //cards.add(new SetCardInfo("Viral Fame", 39, Rarity.UNCOMMON, mage.cards.v.ViralFame.class));
        //cards.add(new SetCardInfo("Wrath of Mod", 40, Rarity.RARE, mage.cards.w.WrathOfMod.class));
        //cards.add(new SetCardInfo("Accelerated Assembly", 41, Rarity.UNCOMMON, mage.cards.a.AcceleratedAssembly.class));
        //cards.add(new SetCardInfo("Ancestral Research", 42, Rarity.RARE, mage.cards.a.AncestralResearch.class));
        //cards.add(new SetCardInfo("Atares 14", 43, Rarity.UNCOMMON, mage.cards.a.Atares14.class));
        //cards.add(new SetCardInfo("Automated Archivist", 44, Rarity.UNCOMMON, mage.cards.a.AutomatedArchivist.class));
        //cards.add(new SetCardInfo("Automatic Override", 45, Rarity.COMMON, mage.cards.a.AutomaticOverride.class));
        //cards.add(new SetCardInfo("Back Door", 46, Rarity.RARE, mage.cards.b.BackDoor.class));
        //cards.add(new SetCardInfo("Cloud Colossus", 47, Rarity.RARE, mage.cards.c.CloudColossus.class));
        //cards.add(new SetCardInfo("Colossal Construct", 48, Rarity.COMMON, mage.cards.c.ColossalConstruct.class));
        //cards.add(new SetCardInfo("Corporate Ascension", 49, Rarity.RARE, mage.cards.c.CorporateAscension.class));
        //cards.add(new SetCardInfo("Corporate Control", 50, Rarity.RARE, mage.cards.c.CorporateControl.class));
        //cards.add(new SetCardInfo("Cryo Cell", 51, Rarity.COMMON, mage.cards.c.CryoCell.class));
        //cards.add(new SetCardInfo("Cyber Savant", 52, Rarity.COMMON, mage.cards.c.CyberSavant.class));
        //cards.add(new SetCardInfo("CyCorp Engineer", 53, Rarity.COMMON, mage.cards.c.CycorpEngineer.class));
        //cards.add(new SetCardInfo("Data Dig", 54, Rarity.COMMON, mage.cards.d.DataDig.class));
        //cards.add(new SetCardInfo("Digiblade Shinobi", 55, Rarity.COMMON, mage.cards.d.DigibladeShinobi.class));
        //cards.add(new SetCardInfo("Flutter Droid", 56, Rarity.UNCOMMON, mage.cards.f.FlutterDroid.class));
        //cards.add(new SetCardInfo("Full Automation", 57, Rarity.MYTHIC, mage.cards.f.FullAutomation.class));
        //cards.add(new SetCardInfo("Hacker Prodigy", 58, Rarity.COMMON, mage.cards.h.HackerProdigy.class));
        //cards.add(new SetCardInfo("Masq Agent", 59, Rarity.UNCOMMON, mage.cards.m.MasqAgent.class));
        //cards.add(new SetCardInfo("Masq Maven", 60, Rarity.RARE, mage.cards.m.MasqMaven.class));
        //cards.add(new SetCardInfo("Mat Harden, Detective", 61, Rarity.RARE, mage.cards.m.MatHardenDetective.class));
        //cards.add(new SetCardInfo("Minimize", 62, Rarity.COMMON, mage.cards.m.Minimize.class));
        //cards.add(new SetCardInfo("Moderator's Discretion", 63, Rarity.UNCOMMON, mage.cards.m.ModeratorsDiscretion.class));
        //cards.add(new SetCardInfo("Net Run", 64, Rarity.COMMON, mage.cards.n.NetRun.class));
        cards.add(new SetCardInfo("NuGolem", 65, Rarity.COMMON, mage.cards.n.Nugolem.class));
        //cards.add(new SetCardInfo("Private Eye", 66, Rarity.COMMON, mage.cards.p.PrivateEye.class));
        //cards.add(new SetCardInfo("Quarantine", 67, Rarity.UNCOMMON, mage.cards.q.Quarantine.class));
        //cards.add(new SetCardInfo("Reprogram", 68, Rarity.COMMON, mage.cards.r.Reprogram.class));
        //cards.add(new SetCardInfo("Scion Mimic", 69, Rarity.RARE, mage.cards.s.ScionMimic.class));
        //cards.add(new SetCardInfo("Shunt Access", 70, Rarity.UNCOMMON, mage.cards.s.ShuntAccess.class));
        //cards.add(new SetCardInfo("Silicon Drake", 71, Rarity.COMMON, mage.cards.s.SiliconDrake.class));
        //cards.add(new SetCardInfo("Skyguard Droid", 72, Rarity.COMMON, mage.cards.s.SkyguardDroid.class));
        //cards.add(new SetCardInfo("Skyguard Officer", 73, Rarity.COMMON, mage.cards.s.SkyguardOfficer.class));
        //cards.add(new SetCardInfo("Standoff", 74, Rarity.UNCOMMON, mage.cards.s.Standoff.class));
        cards.add(new SetCardInfo("Steel Sabotage", 75, Rarity.UNCOMMON, mage.cards.s.SteelSabotage.class));
        //cards.add(new SetCardInfo("Talya, Cyber Wayfarer", 76, Rarity.MYTHIC, mage.cards.t.TalyaCyberWayfarer.class));
        //cards.add(new SetCardInfo("Tempest Droid", 77, Rarity.UNCOMMON, mage.cards.t.TempestDroid.class));
        //cards.add(new SetCardInfo("Torrent Seed", 78, Rarity.COMMON, mage.cards.t.TorrentSeed.class));
        //cards.add(new SetCardInfo("Vat-Grown Infiltrator", 79, Rarity.UNCOMMON, mage.cards.v.VatGrownInfiltrator.class));
        //cards.add(new SetCardInfo("Virtual Reality", 80, Rarity.COMMON, mage.cards.v.VirtualReality.class));
        //cards.add(new SetCardInfo("Abuse of Power", 81, Rarity.COMMON, mage.cards.a.AbuseOfPower.class));
        //cards.add(new SetCardInfo("Amalgamech", 82, Rarity.UNCOMMON, mage.cards.a.Amalgamech.class));
        //cards.add(new SetCardInfo("Blackwatch Ace", 83, Rarity.UNCOMMON, mage.cards.b.BlackwatchAce.class));
        //cards.add(new SetCardInfo("Blackwatch Assassin", 84, Rarity.COMMON, mage.cards.b.BlackwatchAssassin.class));
        //cards.add(new SetCardInfo("Blackwatch Intimidator", 85, Rarity.COMMON, mage.cards.b.BlackwatchIntimidator.class));
        //cards.add(new SetCardInfo("Corporate Confidant", 86, Rarity.RARE, mage.cards.c.CorporateConfidant.class));
        //cards.add(new SetCardInfo("Corporate Infiltrator", 87, Rarity.UNCOMMON, mage.cards.c.CorporateInfiltrator.class));
        //cards.add(new SetCardInfo("Data Demon", 88, Rarity.RARE, mage.cards.d.DataDemon.class));
        //cards.add(new SetCardInfo("Deep Net", 89, Rarity.MYTHIC, mage.cards.d.DeepNet.class));
        //cards.add(new SetCardInfo("Dreadmoth", 90, Rarity.COMMON, mage.cards.d.Dreadmoth.class));
        //cards.add(new SetCardInfo("Failed Creation", 91, Rarity.COMMON, mage.cards.f.FailedCreation.class));
        //cards.add(new SetCardInfo("Ghost in the Machine", 92, Rarity.RARE, mage.cards.g.GhostInTheMachine.class));
        //cards.add(new SetCardInfo("Heaps Baron", 93, Rarity.UNCOMMON, mage.cards.h.HeapsBaron.class));
        //cards.add(new SetCardInfo("Hitman's Discretion", 94, Rarity.UNCOMMON, mage.cards.h.HitmansDiscretion.class));
        //cards.add(new SetCardInfo("Info Dump", 95, Rarity.COMMON, mage.cards.i.InfoDump.class));
        //cards.add(new SetCardInfo("Malware", 96, Rarity.COMMON, mage.cards.m.Malware.class));
        //cards.add(new SetCardInfo("Masq Hacker", 97, Rarity.COMMON, mage.cards.m.MasqHacker.class));
        //cards.add(new SetCardInfo("Misclick", 98, Rarity.RARE, mage.cards.m.Misclick.class));
        //cards.add(new SetCardInfo("MX Dreadnought", 99, Rarity.COMMON, mage.cards.m.MxDreadnought.class));
        //cards.add(new SetCardInfo("Online Tutor", 100, Rarity.UNCOMMON, mage.cards.o.OnlineTutor.class));
        //cards.add(new SetCardInfo("Out of Date", 101, Rarity.UNCOMMON, mage.cards.o.OutOfDate.class));
        //cards.add(new SetCardInfo("Phantom Walker", 102, Rarity.RARE, mage.cards.p.PhantomWalker.class));
        //cards.add(new SetCardInfo("Plugged In", 103, Rarity.UNCOMMON, mage.cards.p.PluggedIn.class));
        //cards.add(new SetCardInfo("Reassembler", 104, Rarity.COMMON, mage.cards.r.Reassembler.class));
        //cards.add(new SetCardInfo("Reboot Droid", 105, Rarity.UNCOMMON, mage.cards.r.RebootDroid.class));
        //cards.add(new SetCardInfo("Redeploy", 106, Rarity.UNCOMMON, mage.cards.r.Redeploy.class));
        cards.add(new SetCardInfo("Robo Boxer", 107, Rarity.COMMON, mage.cards.r.RoboBoxer.class));
        //cards.add(new SetCardInfo("Robo Rodent", 108, Rarity.COMMON, mage.cards.r.RoboRodent.class));
        //cards.add(new SetCardInfo("Salvage Hoarder", 109, Rarity.COMMON, mage.cards.s.SalvageHoarder.class));
        //cards.add(new SetCardInfo("Scythe VII", 110, Rarity.UNCOMMON, mage.cards.s.ScytheVii.class));
        //cards.add(new SetCardInfo("Self-Destruct Sequence", 111, Rarity.RARE, mage.cards.s.SelfDestructSequence.class));
        //cards.add(new SetCardInfo("Server Wipe", 112, Rarity.COMMON, mage.cards.s.ServerWipe.class));
        cards.add(new SetCardInfo("Shrieking Affliction", 113, Rarity.UNCOMMON, mage.cards.s.ShriekingAffliction.class));
        //cards.add(new SetCardInfo("Sick Nic, Baron of Crime", 114, Rarity.MYTHIC, mage.cards.s.SickNicBaronOfCrime.class));
        //cards.add(new SetCardInfo("Sky Prowler", 115, Rarity.COMMON, mage.cards.s.SkyProwler.class));
        //cards.add(new SetCardInfo("Szaro, Bounty Hunter", 116, Rarity.RARE, mage.cards.s.SzaroBountyHunter.class));
        //cards.add(new SetCardInfo("Turf Killing", 117, Rarity.COMMON, mage.cards.t.TurfKilling.class));
        //cards.add(new SetCardInfo("Vainglorious Pilot", 118, Rarity.COMMON, mage.cards.v.VaingloriousPilot.class));
        //cards.add(new SetCardInfo("Vape Fiend", 119, Rarity.COMMON, mage.cards.v.VapeFiend.class));
        //cards.add(new SetCardInfo("Aggressive Demining", 120, Rarity.UNCOMMON, mage.cards.a.AggressiveDemining.class));
        //cards.add(new SetCardInfo("Andreux Von, Extremist", 121, Rarity.RARE, mage.cards.a.AndreuxVonExtremist.class));
        //cards.add(new SetCardInfo("Angry Flamer", 122, Rarity.UNCOMMON, mage.cards.a.AngryFlamer.class));
        //cards.add(new SetCardInfo("Assault Squad", 123, Rarity.UNCOMMON, mage.cards.a.AssaultSquad.class));
        //cards.add(new SetCardInfo("Blitz Suit", 124, Rarity.UNCOMMON, mage.cards.b.BlitzSuit.class));
        //cards.add(new SetCardInfo("Civil Unrest", 125, Rarity.COMMON, mage.cards.c.CivilUnrest.class));
        //cards.add(new SetCardInfo("Corporate Gamble", 126, Rarity.MYTHIC, mage.cards.c.CorporateGamble.class));
        //cards.add(new SetCardInfo("Cyber Courier", 127, Rarity.COMMON, mage.cards.c.CyberCourier.class));
        //cards.add(new SetCardInfo("Deadeye Shinobi", 128, Rarity.UNCOMMON, mage.cards.d.DeadeyeShinobi.class));
        cards.add(new SetCardInfo("Demolish", 129, Rarity.COMMON, mage.cards.d.Demolish.class));
        //cards.add(new SetCardInfo("Doxxing", 130, Rarity.UNCOMMON, mage.cards.d.Doxxing.class));
        //cards.add(new SetCardInfo("Extremist's Discretion", 131, Rarity.UNCOMMON, mage.cards.e.ExtremistsDiscretion.class));
        //cards.add(new SetCardInfo("Gun Runner", 132, Rarity.COMMON, mage.cards.g.GunRunner.class));
        //cards.add(new SetCardInfo("Hard Crash", 133, Rarity.UNCOMMON, mage.cards.h.HardCrash.class));
        //cards.add(new SetCardInfo("Hired Hit", 134, Rarity.COMMON, mage.cards.h.HiredHit.class));
        //cards.add(new SetCardInfo("Hunter-Seeker", 135, Rarity.UNCOMMON, mage.cards.h.HunterSeeker.class));
        //cards.add(new SetCardInfo("Junkyard Boss", 136, Rarity.COMMON, mage.cards.j.JunkyardBoss.class));
        //cards.add(new SetCardInfo("Lab Wrecker", 137, Rarity.UNCOMMON, mage.cards.l.LabWrecker.class));
        //cards.add(new SetCardInfo("Lizardman Outbreak", 138, Rarity.COMMON, mage.cards.l.LizardmanOutbreak.class));
        //cards.add(new SetCardInfo("Lock and Load", 139, Rarity.RARE, mage.cards.l.LockAndLoad.class));
        //cards.add(new SetCardInfo("Mecha Dragon", 140, Rarity.MYTHIC, mage.cards.m.MechaDragon.class));
        //cards.add(new SetCardInfo("Motley Crew", 141, Rarity.RARE, mage.cards.m.MotleyCrew.class));
        //cards.add(new SetCardInfo("MX Juggernaut", 142, Rarity.RARE, mage.cards.m.MxJuggernaut.class));
        //cards.add(new SetCardInfo("Out for Blood", 143, Rarity.COMMON, mage.cards.o.OutForBlood.class));
        //cards.add(new SetCardInfo("Particular Skills", 144, Rarity.UNCOMMON, mage.cards.p.ParticularSkills.class));
        //cards.add(new SetCardInfo("Quick Draw", 145, Rarity.COMMON, mage.cards.q.QuickDraw.class));
        //cards.add(new SetCardInfo("Rabid Tri-Limb", 146, Rarity.UNCOMMON, mage.cards.r.RabidTriLimb.class));
        //cards.add(new SetCardInfo("Road Rebel", 147, Rarity.COMMON, mage.cards.r.RoadRebel.class));
        //cards.add(new SetCardInfo("Robotic Revolutionary", 148, Rarity.COMMON, mage.cards.r.RoboticRevolutionary.class));
        cards.add(new SetCardInfo("Rogue Prototype", 149, Rarity.COMMON, mage.cards.r.RoguePrototype.class));
        //cards.add(new SetCardInfo("Saurian Mechanic", 150, Rarity.RARE, mage.cards.s.SaurianMechanic.class));
        //cards.add(new SetCardInfo("Saurian Striker", 151, Rarity.COMMON, mage.cards.s.SaurianStriker.class));
        //cards.add(new SetCardInfo("Smash Droid", 152, Rarity.COMMON, mage.cards.s.SmashDroid.class));
        //cards.add(new SetCardInfo("Spice Den", 153, Rarity.RARE, mage.cards.s.SpiceDen.class));
        //cards.add(new SetCardInfo("Street Hacker", 154, Rarity.RARE, mage.cards.s.StreetHacker.class));
        //cards.add(new SetCardInfo("Street Thief", 155, Rarity.COMMON, mage.cards.s.StreetThief.class));
        //cards.add(new SetCardInfo("Thrill Seekers", 156, Rarity.COMMON, mage.cards.t.ThrillSeekers.class));
        //cards.add(new SetCardInfo("Torrent Feed", 157, Rarity.COMMON, mage.cards.t.TorrentFeed.class));
        cards.add(new SetCardInfo("Turn to Slag", 158, Rarity.COMMON, mage.cards.t.TurnToSlag.class));
        //cards.add(new SetCardInfo("Amphin Vigilante", 159, Rarity.UNCOMMON, mage.cards.a.AmphinVigilante.class));
        //cards.add(new SetCardInfo("Arachdroid", 160, Rarity.UNCOMMON, mage.cards.a.Arachdroid.class));
        //cards.add(new SetCardInfo("Arcologize", 161, Rarity.UNCOMMON, mage.cards.a.Arcologize.class));
        //cards.add(new SetCardInfo("City Councilman", 162, Rarity.COMMON, mage.cards.c.CityCouncilman.class));
        //cards.add(new SetCardInfo("City Wrecker", 163, Rarity.RARE, mage.cards.c.CityWrecker.class));
        //cards.add(new SetCardInfo("Commune Colossus", 164, Rarity.COMMON, mage.cards.c.CommuneColossus.class));
        cards.add(new SetCardInfo("Creeping Corrosion", 165, Rarity.RARE, mage.cards.c.CreepingCorrosion.class));
        //cards.add(new SetCardInfo("Digital Witness", 166, Rarity.UNCOMMON, mage.cards.d.DigitalWitness.class));
        //cards.add(new SetCardInfo("District Explorer", 167, Rarity.COMMON, mage.cards.d.DistrictExplorer.class));
        //cards.add(new SetCardInfo("Garden Grafter", 168, Rarity.UNCOMMON, mage.cards.g.GardenGrafter.class));
        //cards.add(new SetCardInfo("Gunmetal Hydra", 169, Rarity.RARE, mage.cards.g.GunmetalHydra.class));
        cards.add(new SetCardInfo("Hulk Droid", 170, Rarity.COMMON, mage.cards.h.HulkDroid.class));
        //cards.add(new SetCardInfo("Hunter's Discretion", 171, Rarity.UNCOMMON, mage.cards.h.HuntersDiscretion.class));
        //cards.add(new SetCardInfo("Machine Oracle", 172, Rarity.RARE, mage.cards.m.MachineOracle.class));
        //cards.add(new SetCardInfo("Monstrous Apex", 173, Rarity.MYTHIC, mage.cards.m.MonstrousApex.class));
        //cards.add(new SetCardInfo("N-FORCE Ranger", 174, Rarity.UNCOMMON, mage.cards.n.NForceRanger.class));
        //cards.add(new SetCardInfo("Nano Field", 175, Rarity.COMMON, mage.cards.n.NanoField.class));
        //cards.add(new SetCardInfo("Nanobirther", 176, Rarity.MYTHIC, mage.cards.n.Nanobirther.class));
        cards.add(new SetCardInfo("Natural End", 177, Rarity.COMMON, mage.cards.n.NaturalEnd.class));
        cards.add(new SetCardInfo("Plummet", 178, Rarity.COMMON, mage.cards.p.Plummet.class));
        //cards.add(new SetCardInfo("Redistricting", 179, Rarity.UNCOMMON, mage.cards.r.Redistricting.class));
        //cards.add(new SetCardInfo("Refuge Warden", 180, Rarity.COMMON, mage.cards.r.RefugeWarden.class));
        //cards.add(new SetCardInfo("Resilient Recluse", 181, Rarity.COMMON, mage.cards.r.ResilientRecluse.class));
        //cards.add(new SetCardInfo("Sapien Sergeant", 182, Rarity.RARE, mage.cards.s.SapienSergeant.class));
        //cards.add(new SetCardInfo("Secret Keeper", 183, Rarity.COMMON, mage.cards.s.SecretKeeper.class));
        //cards.add(new SetCardInfo("Sewer Skinner", 184, Rarity.UNCOMMON, mage.cards.s.SewerSkinner.class));
        //cards.add(new SetCardInfo("Shark Splice", 185, Rarity.UNCOMMON, mage.cards.s.SharkSplice.class));
        //cards.add(new SetCardInfo("Showmatch", 186, Rarity.COMMON, mage.cards.s.Showmatch.class));
        //cards.add(new SetCardInfo("Soylent Soaker", 187, Rarity.COMMON, mage.cards.s.SoylentSoaker.class));
        //cards.add(new SetCardInfo("Splice Thug", 188, Rarity.COMMON, mage.cards.s.SpliceThug.class));
        //cards.add(new SetCardInfo("State of Affairs", 189, Rarity.RARE, mage.cards.s.StateOfAffairs.class));
        //cards.add(new SetCardInfo("Streetwise Saurian", 190, Rarity.COMMON, mage.cards.s.StreetwiseSaurian.class));
        //cards.add(new SetCardInfo("Substantial Upgrade", 191, Rarity.COMMON, mage.cards.s.SubstantialUpgrade.class));
        //cards.add(new SetCardInfo("TC-7 Titan", 192, Rarity.UNCOMMON, mage.cards.t.Tc7Titan.class));
        //cards.add(new SetCardInfo("TC-14 Behemoth", 193, Rarity.RARE, mage.cards.t.Tc14Behemoth.class));
        //cards.add(new SetCardInfo("Toxic Leper", 194, Rarity.COMMON, mage.cards.t.ToxicLeper.class));
        //cards.add(new SetCardInfo("Unfettered Lusus", 195, Rarity.UNCOMMON, mage.cards.u.UnfetteredLusus.class));
        //cards.add(new SetCardInfo("Urban Sprawl", 196, Rarity.COMMON, mage.cards.u.UrbanSprawl.class));
        //cards.add(new SetCardInfo("Web Crawler", 197, Rarity.COMMON, mage.cards.w.WebCrawler.class));
        //cards.add(new SetCardInfo("Aerial Gunner", 198, Rarity.UNCOMMON, mage.cards.a.AerialGunner.class));
        //cards.add(new SetCardInfo("Duplicate Results", 199, Rarity.RARE, mage.cards.d.DuplicateResults.class));
        //cards.add(new SetCardInfo("Escaped Specimen", 200, Rarity.UNCOMMON, mage.cards.e.EscapedSpecimen.class));
        //cards.add(new SetCardInfo("Expansion Plans", 201, Rarity.UNCOMMON, mage.cards.e.ExpansionPlans.class));
        //cards.add(new SetCardInfo("Gun Collector", 202, Rarity.UNCOMMON, mage.cards.g.GunCollector.class));
        //cards.add(new SetCardInfo("Institutional Inertia", 203, Rarity.UNCOMMON, mage.cards.i.InstitutionalInertia.class));
        //cards.add(new SetCardInfo("Masq Saboteur", 204, Rarity.RARE, mage.cards.m.MasqSaboteur.class));
        //cards.add(new SetCardInfo("Mecha Contract", 205, Rarity.UNCOMMON, mage.cards.m.MechaContract.class));
        //cards.add(new SetCardInfo("Mercenary Autopilot", 206, Rarity.RARE, mage.cards.m.MercenaryAutopilot.class));
        //cards.add(new SetCardInfo("Mirsi, Mother of Mutants", 207, Rarity.RARE, mage.cards.m.MirsiMotherOfMutants.class));
        //cards.add(new SetCardInfo("Night Hacker", 208, Rarity.UNCOMMON, mage.cards.n.NightHacker.class));
        //cards.add(new SetCardInfo("Quickdraw Vigilante", 209, Rarity.RARE, mage.cards.q.QuickdrawVigilante.class));
        //cards.add(new SetCardInfo("Re-spec", 210, Rarity.RARE, mage.cards.r.ReSpec.class));
        //cards.add(new SetCardInfo("Short Circuit", 211, Rarity.UNCOMMON, mage.cards.s.ShortCircuit.class));
        //cards.add(new SetCardInfo("Skyguard Ascendant", 212, Rarity.UNCOMMON, mage.cards.s.SkyguardAscendant.class));
        //cards.add(new SetCardInfo("Skyguard Sovereign", 213, Rarity.RARE, mage.cards.s.SkyguardSovereign.class));
        //cards.add(new SetCardInfo("Stirring Pride", 214, Rarity.RARE, mage.cards.s.StirringPride.class));
        //cards.add(new SetCardInfo("Strings of the Masquerade", 215, Rarity.MYTHIC, mage.cards.s.StringsOfTheMasquerade.class));
        //cards.add(new SetCardInfo("Switchflit", 216, Rarity.MYTHIC, mage.cards.s.Switchflit.class));
        //cards.add(new SetCardInfo("Toxic Scrap Heap", 217, Rarity.RARE, mage.cards.t.ToxicScrapHeap.class));
        //cards.add(new SetCardInfo("Turf Tender", 218, Rarity.RARE, mage.cards.t.TurfTender.class));
        //cards.add(new SetCardInfo("Underworld Deeds", 219, Rarity.UNCOMMON, mage.cards.u.UnderworldDeeds.class));
        //cards.add(new SetCardInfo("Awakened Droid", 220, Rarity.UNCOMMON, mage.cards.a.AwakenedDroid.class));
        //cards.add(new SetCardInfo("Butler Droid", 221, Rarity.UNCOMMON, mage.cards.b.ButlerDroid.class));
        cards.add(new SetCardInfo("Citizen Droid", 222, Rarity.COMMON, mage.cards.c.CitizenDroid.class));
        //cards.add(new SetCardInfo("Combat Droid", 223, Rarity.COMMON, mage.cards.c.CombatDroid.class));
        //cards.add(new SetCardInfo("Cultivation Nanotech", 224, Rarity.COMMON, mage.cards.c.CultivationNanotech.class));
        //cards.add(new SetCardInfo("Cybersmith", 225, Rarity.UNCOMMON, mage.cards.c.Cybersmith.class));
        //cards.add(new SetCardInfo("Data Petal", 226, Rarity.UNCOMMON, mage.cards.d.DataPetal.class));
        //cards.add(new SetCardInfo("Dystopilith", 227, Rarity.MYTHIC, mage.cards.d.Dystopilith.class));
        //cards.add(new SetCardInfo("Invasive Nanotech", 228, Rarity.COMMON, mage.cards.i.InvasiveNanotech.class));
        //cards.add(new SetCardInfo("JMD Dome", 229, Rarity.UNCOMMON, mage.cards.j.JmdDome.class));
        //cards.add(new SetCardInfo("Malign Nanotech", 230, Rarity.COMMON, mage.cards.m.MalignNanotech.class));
        //cards.add(new SetCardInfo("Medicinal Nanotech", 231, Rarity.COMMON, mage.cards.m.MedicinalNanotech.class));
        cards.add(new SetCardInfo("The Network", 232, Rarity.MYTHIC, mage.cards.t.TheNetwork.class));
        //cards.add(new SetCardInfo("Neural Nanotech", 233, Rarity.COMMON, mage.cards.n.NeuralNanotech.class));
        //cards.add(new SetCardInfo("Rebel Cocktail", 234, Rarity.COMMON, mage.cards.r.RebelCocktail.class));
        //cards.add(new SetCardInfo("Scrap Market", 235, Rarity.RARE, mage.cards.s.ScrapMarket.class));
        //cards.add(new SetCardInfo("Security Drone", 236, Rarity.COMMON, mage.cards.s.SecurityDrone.class));
        //cards.add(new SetCardInfo("Server Farm", 237, Rarity.COMMON, mage.cards.s.ServerFarm.class));
        //cards.add(new SetCardInfo("Soylent Station", 238, Rarity.RARE, mage.cards.s.SoylentStation.class));
        //cards.add(new SetCardInfo("Supercomputer", 239, Rarity.RARE, mage.cards.s.Supercomputer.class));
        //cards.add(new SetCardInfo("Ascending Spires", 240, Rarity.RARE, mage.cards.a.AscendingSpires.class));
        //cards.add(new SetCardInfo("BiHelix Laboratory", 241, Rarity.UNCOMMON, mage.cards.b.BihelixLaboratory.class));
        //cards.add(new SetCardInfo("Blackwatch Turf", 242, Rarity.UNCOMMON, mage.cards.b.BlackwatchTurf.class));
        //cards.add(new SetCardInfo("Coruscating Cityscape", 243, Rarity.RARE, mage.cards.c.CoruscatingCityscape.class));
        //cards.add(new SetCardInfo("CyCorp Research Facility", 244, Rarity.UNCOMMON, mage.cards.c.CycorpResearchFacility.class));
        //cards.add(new SetCardInfo("Holo-Den", 245, Rarity.COMMON, mage.cards.h.HoloDen.class));
        //cards.add(new SetCardInfo("MekLab Factory", 246, Rarity.UNCOMMON, mage.cards.m.MeklabFactory.class));
        //cards.add(new SetCardInfo("N-FORCE Station", 247, Rarity.UNCOMMON, mage.cards.n.NForceStation.class));
        //cards.add(new SetCardInfo("Shadowed Pillar", 248, Rarity.RARE, mage.cards.s.ShadowedPillar.class));
        //cards.add(new SetCardInfo("Sprawling Coils", 249, Rarity.RARE, mage.cards.s.SprawlingCoils.class));
        //cards.add(new SetCardInfo("Umbrous Depths", 250, Rarity.RARE, mage.cards.u.UmbrousDepths.class));
        //cards.add(new SetCardInfo("Vibrant Locale", 251, Rarity.RARE, mage.cards.v.VibrantLocale.class));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Swamp", 254, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Mountain", 255, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ));
        cards.add(new SetCardInfo("Forest", 256, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ));
    }
}
