/**
 * Copyright (C) 2014 Trojaner25
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package net.gtaun.shoebill.constant;
 //Todo: add type? (e.g: CJ(0, "Carl \"CJ\" Johnson", Gender.MALE, SkinType.STORY))
 
/**
 * @author Trojaner25
 */
public enum SkinModel {
    //Source: http://wiki.sa-mp.com/wiki/Skins:All

    CJ(0, "Carl \"CJ\" Johnson", Gender.MALE),
    TRUTH(1, "The Truth", Gender.MALE),
    MACCER(2, "Maccer", Gender.MALE),
    ANDRE(3, "Andre", Gender.MALE),
    BBTHIN(4, "Barry \"Big Bear\" Thorne (Thin)", Gender.MALE),
    BB(5, "Barry \"Big Bear\" Thorne (Big)", Gender.MALE),
    EMMET(6, "Emmet", Gender.MALE),
    MALE01(7, "Taxi Driver/Train Driver", Gender.MALE),
    JANITOR(8, "Janitor", Gender.MALE),
    BFORI(9, "Normal Ped", Gender.FEMALE),
    BFOST(10, "Old Woman", Gender.FEMALE),
    VBYCRP(11, "Casino croupier", Gender.FEMALE),
    BYFRI(12, "Rich Woman", Gender.FEMALE),
    BYFST(13, "Street Girl", Gender.FEMALE),
    BMORI(14, "Normal Ped", Gender.MALE),
    BMOST(15, "Mr.Whittaker (RS Haul Owner)", Gender.MALE),
    BMYAP(16, "Airport Ground Worker", Gender.MALE),
    BMYBU(17, "Businessman", Gender.MALE),
    BMYBE(18, "Beach Visitor", Gender.MALE),
    BMYDJ(19, "DJ", Gender.MALE),
    BMYRI(20, "Rich Guy (Madd Dogg's Manager)", Gender.MALE),
    BMYCR(21, "Normal Ped", Gender.MALE),
    BMYST(22, "Normal Ped", Gender.MALE),
    WMYBMX(23, "BMXer", Gender.MALE),
    WBDYG1(24, "Madd Dogg Bodyguard", Gender.MALE),
    WBDYG2(25, "Madd Dogg Bodyguard", Gender.MALE),
    WMYBP(26, "Backpacker", Gender.MALE),
    WMYCON(27, "Construction Worker", Gender.MALE),
    BMYDRUG(28, "Drug Dealer", Gender.MALE),
    WMYDRUG(29, "Drug Dealer", Gender.MALE),
    HMYDRUG(30, "Drug Dealer", Gender.MALE),
    DWFOLC(31, "Farm-Town inhabitant", Gender.FEMALE),
    DWMOLC1(32, "Farm-Town inhabitant", Gender.MALE),
    DWMOLC2(33, "Farm-Town inhabitant", Gender.MALE),
    DWMYLC1(34, "Farm-Town inhabitant", Gender.MALE),
    HMOGAR(35, "Gardener", Gender.MALE),
    WMYGOL1(36, "Golfer", Gender.MALE),
    WMYGOL2(37, "Golfer", Gender.MALE),
    HFORI(38, "Normal Ped", Gender.MALE),
    HFOST(39, "Normal Ped", Gender.FEMALE),
    HFYRI(40, "Normal Ped", Gender.FEMALE),
    HFYST(41, "Normal Ped", Gender.FEMALE),
    JETHRO(42, "Jethro", Gender.MALE),
    HMORI(43, "Normal Ped", Gender.MALE),
    HMOST(44, "Normal Ped", Gender.MALE),
    HMYBE(45, "Beach Visitor", Gender.MALE),
    HMYRI(46, "Normal Ped", Gender.MALE),
    HMYCR(47, "Normal Ped", Gender.MALE),
    HMYST(48, "Normal Ped", Gender.MALE),
    OMOKUNG(49, "Snakehead (Da Nang)", Gender.MALE),
    WMYMECH(50, "Meachanic", Gender.MALE),
    BMYMOUN(51, "Mountain Biker", Gender.MALE),
    WMYMOUN(52, "Mountain Biker", Gender.MALE),
    UNKOWN(53, "Unknown", Gender.FEMALE), //??
    OFOST(54, "Normal Ped", Gender.FEMALE),
    OFYRI(55, "Normal Ped", Gender.FEMALE),
    OFYST(56, "Normal Ped", Gender.FEMALE),
    OMORI(57, "Oriental Ped", Gender.MALE),
    OMOST(58, "Oriental Ped", Gender.MALE),
    OMYRI(59, "Normal Ped", Gender.MALE),
    OMYST(60, "Normal Ped", Gender.MALE),
    WMYPLT(61, "Pilot", Gender.MALE),
    WMOPJ(62, "Colonel Fuhrberger", Gender.MALE),
    BFYPRO(63, "Prostitute", Gender.FEMALE),
    HFYPRO(64, "Prostitute", Gender.FEMALE),
    KENDL(65, "Kendl Johnson", Gender.FEMALE),
    BMYPOL1(66, "Pool Player", Gender.MALE),
    BMYPOL2(67, "Pool Player", Gender.MALE),
    WMOPREA(68, "Priest/Preacher", Gender.MALE),
    SBFYST(69, "Normal Ped", Gender.FEMALE),
    WMOSCI(70, "Scientist", Gender.MALE),
    WMYSGRD(71, "Security Guard", Gender.MALE),
    SWMYHP1(72, "Hippy", Gender.MALE),
    SWMYHP2(73, "Hippy", Gender.MALE),
    // No 74?
    SWFOPRO(75, "Prostitute", Gender.FEMALE),
    WFYSTEW(76, "Normal Ped", Gender.FEMALE),
    SWMPOTR1(77, "Homeless", Gender.FEMALE),
    WMOTR1(78, "Homeless", Gender.MALE),
    BMOTR1(79, "Homeless", Gender.MALE),
    VBMYBOX(80, "Boxer", Gender.MALE),
    VWMYBOX(81, "Boxer", Gender.MALE),
    VHMYELV(82, "Black Elvis", Gender.MALE),
    VBMYELV(83, "White Elvis", Gender.MALE),
    VIMYELV(84, "Blue Elvis", Gender.MALE),
    VWFYPRO(85, "Prostitute", Gender.FEMALE),
    RYDER3(86, "Ryder with robbery mask", Gender.MALE),
    VWFYST1(87, "Stripper", Gender.FEMALE),
    WFORI(88, "Normal Ped", Gender.FEMALE),
    WFOST(89, "Normal Ped", Gender.FEMALE),
    WFYJG(90, "Jogger", Gender.FEMALE),
    WFYRI(91, "Rich Woman", Gender.FEMALE),
    WFYRO(92, "Rollerskater", Gender.FEMALE),
    WFYST(93, "Normal Ped", Gender.FEMALE),
    WMORI(94, "Normal Ped", Gender.MALE),
    WMOST(95, "Normal Ped", Gender.MALE),
    WMYJG(96, "Jogger", Gender.MALE),
    WMYLG(97, "Lifeguard", Gender.MALE),
    WMYRI(98, "Normal Ped", Gender.MALE),
    WMYRO(99, "Rollerskater", Gender.MALE),
    WMYCR(100, "Biker", Gender.MALE),
    WMYST(101, "Normal Ped", Gender.MALE),
    BALLAS1(102, "Balla", Gender.MALE),
    BALLAS2(103, "Balla", Gender.MALE),
    BALLAS3(104, "Balla", Gender.MALE),
    FAM1(105, "Grove Street Families", Gender.MALE),
    FAM2(106, "Grove Street Families", Gender.MALE),
    FAM3(107, "Grove Street Families", Gender.MALE),
    LSV1(108, "Los Santos Vagos", Gender.MALE),
    LSV2(109, "Los Santos Vagos", Gender.MALE),
    LSV3(110, "Los Santos Vagos", Gender.MALE),
    MAFFA(111, "The Russian Mafia", Gender.MALE),
    MAFFB(112, "The Russian Mafia", Gender.MALE),
    MAFBOSS(113, "The Russian Mafia", Gender.MALE),
    VLA1(114, "Varios Los Aztecas", Gender.MALE),
    VLA2(115, "Varios Los Aztecas", Gender.MALE),
    VLA3(116, "Varios Los Aztecas", Gender.MALE),
    TRIADA(117, "Triad", Gender.MALE),
    TRIADB(118, "Triad", Gender.MALE),
    SINDACO(119, "Johnny Sindacco", Gender.MALE),
    TRIBOSS(120, "Triad Boss", Gender.MALE),
    DNB1(121, "Da Nang Boy", Gender.MALE),
    DNB2(122, "Da Nang Boy", Gender.MALE),
    DNB3(123, "Da Nang Boy", Gender.MALE),
    VMAFF1(124, "The Mafia", Gender.MALE),
    VMAFF2(125, "The Mafia", Gender.MALE),
    VMAFF3(126, "The Mafia", Gender.MALE),
    VMAFF4(127, "The Mafia", Gender.MALE),
    DNYMYLC(128, "Farm Inhabitant", Gender.MALE),
    DNFOLC1(129, "Farm Inhabitant", Gender.FEMALE),
    DNFOLC2(130, "Farm Inhabitant", Gender.FEMALE),
    DNFYLC(131, "Farm Inhabitant", Gender.FEMALE),
    DNMOLC1(132, "Farm Inhabitant", Gender.MALE),
    DNMOLC2(133, "Farm Inhabitant", Gender.MALE),
    SBMOTR2(134, "Homeless", Gender.MALE),
    SWMOTR2(135, "Homeless", Gender.MALE),
    SBMYTR3(136, "Normal Ped", Gender.MALE),
    SWMOTR3(137, "Homeless", Gender.MALE),
    WFYBE(138, "Beach Visitor", Gender.FEMALE),
    BFYBE(139, "Beach Visitor", Gender.FEMALE),
    HFYBE(140, "Beach Visitor", Gender.FEMALE),
    SOFYBU(141, "Businesswoman", Gender.FEMALE),
    SBMYST(142, "Taxi Driver", Gender.MALE),
    SBMYCR(143, "Crack Maker", Gender.MALE),
    BMYCG(144, "Crack Maker", Gender.MALE),
    WFYCRK(145, "Crack Maker", Gender.FEMALE),
    HMYCM(146, "Crack Maker", Gender.MALE),
    WMYBU(147, "Businessman", Gender.MALE),
    BFYBU(148, "Businesswoman", Gender.FEMALE),
    SMOKEV(149, "Big Smoke Armored", Gender.MALE),
    WFYBU(150, "Businessswoman", Gender.FEMALE),
    DWFYLC1(151, "Normal Ped", Gender.FEMALE),
    WFYPRO(152, "Prostitute", Gender.FEMALE),
    WMYCONB(153, "Construction Worker", Gender.MALE),
    WMYBE(154, "Beach Visitor", Gender.MALE),
    WMYPIZZ(155, "Well Stacked Pizza Worker", Gender.MALE),
    BMOBAR(156, "Barber", Gender.MALE),
    CWFYHB(157, "Hillbilly", Gender.FEMALE),
    CWMOFR(158, "Farmer", Gender.MALE),
    CWMOHB1(159, "Hillbilly", Gender.MALE),
    CWMOHB2(160, "Hillbilly", Gender.MALE),
    CWMYFR(161, "Farmer", Gender.MALE),
    CWMYHB1(162, "Hillbilly", Gender.MALE),
    BMYBOUN(163, "Black Bouncer", Gender.MALE),
    WMYBOUN(164, "White Bouncer", Gender.MALE),
    WMOMIB(165, "White MIB agent", Gender.MALE),
    BMYMIB(166, "Black MIB agent", Gender.MALE),
    WMYBELL(167, "Cluckin' Bell Worke", Gender.MALE),
    BMOCHIL(168, "Hotdog/Chilli Dog Vendor", Gender.MALE),
    SOFYRI(169, "Normal Ped", Gender.FEMALE),
    SOMYST(170, "Normal Ped", Gender.MALE),
    VWMYBJD(171, "Blackjack Dealer", Gender.MALE),
    VWFYCRP(172, "Casino Croupier", Gender.FEMALE),
    SFR1(173, "San Fierro Rifa", Gender.MALE),
    SFR2(174, "San Fierro Rifa", Gender.MALE),
    SFR3(175, "San Fierro Rifa", Gender.MALE),
    BMYBAR(176, "Barber", Gender.MALE),
    WMYBAR(177, "Barber", Gender.MALE),
    WFYSEX(178, "Whore", Gender.FEMALE),
    WMYAMMO(179, "Ammunation Salesman", Gender.MALE),
    BMYTATT(180, "Tattoo Artist", Gender.MALE),
    VWMYCR(181, "Punk", Gender.MALE),
    VBMOCD(182, "Cab Driver", Gender.MALE),
    VBMYCR(183, "Normal Ped", Gender.MALE),
    VHMYCR(184, "Normal Ped", Gender.MALE),
    SBMYRI(185, "Normal Ped", Gender.MALE),
    SOMYRI(186, "Normal Ped", Gender.MALE),
    SOMYBU(187, "Businessman", Gender.MALE),
    SWMYST(188, "Normal Ped", Gender.MALE),
    WMYVA(189, "Valet", Gender.MALE),
    COPGRL3(190, "Barbara Schternvart", Gender.FEMALE),
    GUNGRL3(191, "Helena Wankstein", Gender.FEMALE),
    MECGRL(192, "Michelle Cannes", Gender.FEMALE),
    NURGRL3(193, "Katie Zhan", Gender.FEMALE),
    CROCGRL3(194, "Millie Perkins", Gender.FEMALE),
    GANGRL3(195, "Denise Robinson", Gender.FEMALE),
    CWFOFR(196, "Farm-Town inhabitan", Gender.FEMALE),
    CWFOHB(197, "Hillbilly", Gender.FEMALE),
    CWFYFR1(198, "Farm-Town inhabitan", Gender.FEMALE),
    CWFYFR2(199, "Farm-Town inhabitan", Gender.FEMALE),
    CWMYHB2(200, "Hillbilly", Gender.MALE),
    DWFYLC2(201, "Farmer", Gender.FEMALE),
    DWMYLC2(202, "Farmer", Gender.MALE),
    OMYKARA(203, "Karate Teacher", Gender.MALE),
    WMYKARA(204, "Karate Teacher", Gender.MALE),
    WFYBURG(205, "Burger Shot Cashier", Gender.FEMALE),
    VWMYCD(206, "Cab Driver", Gender.MALE),
    VHFYPRO(207, "Prostitute", Gender.FEMALE),
    SUZIE(208, "Su Xi Mu (Suzie)", Gender.MALE),
    OMONOOD(209, "Oriental Noodle stand vendor", Gender.MALE),
    OMOBOAT(210, "Oriental Boating School Instructor", Gender.MALE),
    WFYCLOT(211, "Clothes Shop Staff", Gender.FEMALE),
    VWMOTR1(212, "Homeless", Gender.MALE),
    VWMOTR2(213, "Weird old man", Gender.MALE),
    VWFYWAI(214, "Waitress (Maria Latore)", Gender.FEMALE),
    SBFORI(215, "Normal Ped", Gender.FEMALE),
    SWYFRI(216, "Normal Ped", Gender.FEMALE),
    WMYCLOT(217, "Clothes Shop Staff", Gender.MALE),
    SBFOST(218, "Normal Ped", Gender.FEMALE),
    SBFYRI(219, "Rich Woman", Gender.FEMALE),
    SBMOCD(220, "Cab Driver", Gender.MALE),
    SBMORI(221, "Normal Ped", Gender.MALE),
    SBMOST(222, "Normal Ped", Gender.MALE),
    SHMYCR(223, "Normal Ped", Gender.MALE),
    SOFORI(224, "Normal Ped", Gender.FEMALE),
    SOFOST(225, "Normal Ped", Gender.FEMALE),
    SOFYST(226, "Normal Ped", Gender.FEMALE),
    SOMOBU(227, "Oriental Businessman", Gender.MALE),
    SOMORI(228, "Oriental Ped", Gender.MALE),
    SOMOST(229, "Oriental Ped", Gender.MALE),
    SWMOTR5(230, "Homeless", Gender.MALE),
    SWFORI(231, "Normal Ped", Gender.FEMALE),
    SWFOST(232, "Normal Ped", Gender.FEMALE),
    SWFYST(233, "Normal Ped", Gender.FEMALE),
    SWMOCD(234, "Cab Driver", Gender.MALE),
    SWMORI(235, "Normal Ped", Gender.MALE),
    SWMOST(236, "Normal Ped", Gender.MALE),
    SHFYPRO(237, "Prostitute", Gender.FEMALE),
    SBFYPRO(238, "Prostitute", Gender.FEMALE),
    SWMOTR4(239, "Homeless", Gender.MALE),
    SWMYRI(240, "The D.A", Gender.MALE),
    SMYST(241, "Afro-American", Gender.MALE),
    SMYST2(242, "Mexican", Gender.MALE),
    SFYPRO(243, "Prostitute", Gender.FEMALE),
    VBFYST2(244, "Stripper", Gender.FEMALE),
    VBFYPRO(245, "Prostitute", Gender.FEMALE),
    VHFYST3(246, "Stripper", Gender.FEMALE),
    BIKERA(247, "Biker", Gender.MALE),
    BIKERB(248, "Biker", Gender.MALE),
    BMYPIMP(249, "Pimp", Gender.MALE),
    SWMYCR(250, "Normal Ped", Gender.MALE),
    WFYLG(251, "Lifeguard", Gender.FEMALE),
    WMYVA2(252, "Naked Valet", Gender.MALE),
    BMOSEC(253, "Bus Driver", Gender.MALE),
    BIKDRUG(254, "Biker Drug Dealer", Gender.MALE),
    WMYCH(255, "Chauffeur (Limo Driver)", Gender.MALE),
    SBFYSTR(256, "Stripper", Gender.FEMALE),
    SWFYSTR(257, "Stripper", Gender.FEMALE),
    HECK1(258, "Heckler", Gender.MALE),
    HECK2(259, "Heckler", Gender.MALE),
    BMYCON(260, "Construction Worker", Gender.MALE),
    WMYCD1(261, "Cab Driver", Gender.MALE),
    BMOCD(262, "Cab Driver", Gender.MALE),
    VWFYWA2(263, "Normal Ped", Gender.FEMALE),
    WMOICE(264, "Clown (Ice-cream Van Driver)", Gender.MALE),
    TENPEN(265, "Officer Frank Tenpenny (Corrupt Cop)", Gender.MALE),
    PULASKI(266, "Officer Eddie Pulaski (Corrupt Cop)", Gender.MALE),
    HERNANDEZ(267, "Officer Jimmy Hernandez", Gender.MALE),
    DWAYNE(268, "Dwaine/Dwayne", Gender.MALE),
    SMOKE(269, "Melvin \"Big Smoke\" Harris", Gender.MALE),
    SWEET(270, "Sean 'Sweet' Johnson", Gender.MALE),
    RYDER(271, "Lance 'Ryder' Wilson", Gender.MALE),
    FORELLI(272, "Mafia Boss", Gender.MALE),
    TBONE(273, "T-Bone Mendez", Gender.MALE),
    LAEMT1(274, "Paramedic (Emergency Medical Technician)", Gender.MALE),
    LVEMT1(275, "Paramedic (Emergency Medical Technician)", Gender.MALE),
    SFEMT1(276, "Paramedic (Emergency Medical Technician)", Gender.MALE),
    LAFD1(277, "Firefighter", Gender.MALE),
    LVFD1(278, "Firefighter", Gender.MALE),
    SFFD1(279, "Firefighter", Gender.MALE),
    LAPD1(280, "Los Santos Police Officer", Gender.MALE),
    SFPD1(281, "San Fierro Police Officer", Gender.MALE),
    LVPD1(282, "Las Venturas Police Officer", Gender.MALE),
    CSHER(283, "County Sherrif", Gender.MALE),
    LAPDM(284, "LSPD Motorbike Cop", Gender.MALE),
    SWAT(285, "S.W.A.T Special Forces", Gender.MALE),
    FBI(286, "Federal Agent", Gender.MALE),
    ARMY(287, "San Andreas Army", Gender.MALE),
    DHSER(288, "Desert Sheriff", Gender.MALE),
    ZERO(289, "Zero", Gender.MALE),
    ROSE(290, "Kein Rosenberg", Gender.MALE),
    PAUL(291, "Kent Paul", Gender.MALE),
    CESAR(292, "Cesar Vialpando", Gender.MALE),
    OGLOC(293, "Jeffery \"OG Loc\" Martin/Cross", Gender.MALE),
    WUZIMU(294, "Wu Zi Mu (Woozie)", Gender.MALE),
    TORINO(295, "Michael Toreno", Gender.MALE),
    JIZZY(296, "Jizzy B.", Gender.MALE),
    MADDOGG(297, "Madd Dogg", Gender.MALE),
    CAT(298, "Catalina", Gender.FEMALE),
    CLAUDE(299, "Claude Speed", Gender.MALE),
    LAPDNA(300, "Los Santos Police Officer (Without gun holster)", Gender.MALE),
    SFPDNA(301, "San Fierro Police Officer (Without gun holster)", Gender.MALE),
    LVPDNA(302, "Las Venturas Police Officer (Without gun holster)", Gender.MALE),
    LAPDPC(303, "Los Santos Police Officer (Without uniform)", Gender.MALE),
    LAPDPD(304, "Los Santos Police Officer (Without uniform)", Gender.MALE),
    LVPDPC(305, "Las Venturas Police Officer (Without uniform)", Gender.MALE),
    WFYCLPD(306, "Los Santos Police Officer", Gender.FEMALE),
    VBFYCPD(307, "Los Santos Police Officer", Gender.FEMALE),
    WFYCLEM(308, "San Fierro Paramedic (Emergency Medical Technician)", Gender.FEMALE),
    WFYCLLV(309, "Las Venturas Police Officer", Gender.FEMALE),
    CSHERNA(310, "Country Sheriff (Without hat)", Gender.MALE),
    DSHERNA(311, "Desert Sheriff (Without hat)", Gender.MALE);

    
    private int id;
    private Gender gender;
    private String description;

    SkinModel(int id, String description, Gender gender) {
        this.id = id;
        this.gender = gender;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Gender getGender() {
        return gender;
    }

    public static SkinModel[] getAllSkins() {
        return SkinModel.class.getEnumConstants();
    }

    public static SkinModel getSkinById(int id) {
        for (SkinModel model : values())
            if (model.getId() == id)
                return model;
        return null;
    }

    public static boolean isValidSkinId(int id) {
        return getSkinById(id) != null;
    }

    public enum Gender {
        MALE,
        FEMALE
    }

    /**
     * Gets a Skin by it's id
     *
     * @param id ID of the Skin
     * @return SkinModel (null if not found)
     */
    public static SkinModel getById(int id) {
        for (SkinModel model : values()) {
            if (model.getId() == id)
                return model;
        }
        return null; //not found
    }
}
