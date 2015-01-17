package ap2014.asgnment2B.mainclasses;

import java.util.Random;

import ap2014.asgnment2B.questions.*;
import ap2014.asgnment2B.questions.Package;

public class VehicleMain {
	static Random rand = new Random();
	static int r1 = rand.nextInt(9000) + 1;
	static int r2 = rand.nextInt(9000) + 1;

	public static void main(String[] args) {

		// SANTRO
		Santro san = new Santro();
		san.epfw = new EnginePoweredFourWheeler() {
		};
		san.epfw.pack = new Package();
		san.epfw.epv.vehicle = new Vehicle() {
		};
		san.epfw.epv.vehicle.Owner = "Samarth";
		san.epfw.epv.vehicle.numOfWheel = 4;
		san.epfw.epv.vehicle.damage = 0;
		san.epfw.pack.IsExpired = false;

		// AUDI R8
		AudiR8 r8 = new AudiR8();
		r8.epfw = new EnginePoweredFourWheeler() {
		};
		r8.epfw.pack = new Package();
		r8.epfw.epv.vehicle = new Vehicle() {
		};
		r8.epfw.epv.vehicle.numOfWheel = 4;
		r8.epfw.epv.vehicle.Owner = "Manan";
		r8.epfw.epv.vehicle.damage = 0;
		r8.epfw.pack.IsExpired = true;

		// SUZUKI HAYABUSA
		SuzukiHayabusa haya = new SuzukiHayabusa();
		haya.eptw = new EnginePoweredTwoWheeler() {
		};
		haya.eptw.third = new ThirdParty();
		haya.eptw.epv.vehicle = new Vehicle() {
		};
		haya.eptw.epv.vehicle.numOfWheel = 2;
		haya.eptw.epv.vehicle.Owner = "Pradeep";
		haya.eptw.epv.vehicle.damage = 0;
		haya.eptw.third.IsExpired = false;

		// YAMAHA FZS
		YamahaFZS fzs = new YamahaFZS();
		fzs.eptw = new EnginePoweredTwoWheeler() {
		};
		fzs.eptw.third = new ThirdParty();
		fzs.eptw.epv.vehicle = new Vehicle() {
		};
		fzs.eptw.epv.vehicle.numOfWheel = 2;
		fzs.eptw.epv.vehicle.Owner = "Sid";
		fzs.eptw.epv.vehicle.damage = 0;
		fzs.eptw.third.IsExpired = true;

		// HERO HERCULES
		HeroHercules hh = new HeroHercules();
		hh.hpv = new HumanPoweredVehicle() {
		};
		hh.hpv.vehicle = new Vehicle() {
		};
		hh.hpv.vehicle.numOfWheel = 2;
		hh.hpv.vehicle.Owner = "tushar";
		hh.hpv.vehicle.damage = 0;
		hh.hpv.no.HasNo = true;

		// FIREFOX
		Firefox br = new Firefox();
		br.hpv = new HumanPoweredVehicle() {
		};
		br.hpv.vehicle = new Vehicle() {
		};
		br.hpv.vehicle.numOfWheel = 2;
		br.hpv.vehicle.Owner = "Manish";
		br.hpv.no.HasNo = true;
		collide12(san, r8);
		System.out
				.println("========================================================================================");
		;
		collide13(san, haya);
		System.out
				.println("========================================================================================");
		collide14(san, fzs);
		System.out
				.println("========================================================================================");
		collide15(san, hh);
		System.out
				.println("========================================================================================");
		collide16(san, br);
		System.out
				.println("========================================================================================");
		collide21(r8, san);
		System.out
				.println("========================================================================================");
		collide23(r8, haya);
		System.out
				.println("========================================================================================");
		collide24(r8, fzs);
		System.out
				.println("========================================================================================");
		collide25(r8, hh);
		System.out
				.println("========================================================================================");
		collide26(r8, br);
		System.out
				.println("========================================================================================");
		collide31(haya, san);
		System.out
				.println("========================================================================================");
		collide32(haya, r8);
		System.out
				.println("========================================================================================");
		collide34(haya, fzs);
		System.out
				.println("========================================================================================");
		collide35(haya, hh);
		System.out
				.println("========================================================================================");
		collide36(haya, br);
		System.out
				.println("========================================================================================");
		collide41(fzs, san);
		System.out
				.println("========================================================================================");
		collide42(fzs, r8);
		System.out
				.println("========================================================================================");
		collide43(fzs, haya);
		System.out
				.println("========================================================================================");
		collide45(fzs, hh);
		System.out
				.println("========================================================================================");
		collide46(fzs, br);
		System.out
				.println("========================================================================================");
		collide51(hh, san);
		System.out
				.println("========================================================================================");
		collide52(hh, r8);
		System.out
				.println("========================================================================================");
		collide53(hh, haya);
		System.out
				.println("========================================================================================");
		collide54(hh, fzs);
		System.out
				.println("========================================================================================");
		collide56(hh, br);
		System.out
				.println("========================================================================================");
		collide61(br, san);
		System.out
				.println("========================================================================================");
		collide62(br, r8);
		System.out
				.println("========================================================================================");
		collide63(br, haya);
		System.out
				.println("========================================================================================");
		collide64(br, fzs);
		System.out
				.println("========================================================================================");
		collide65(br, hh);
		System.out
				.println("========================================================================================");
	}

	public static void collide16(Santro san, Firefox br) {
		System.out.println("I am santro, " + san.epfw.epv.vehicle.Owner
				+ " collided with Firefox, " + br.hpv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		br.hpv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1 - 0.5 * r1)
				+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));

	}

	public static void collide12(Santro san, AudiR8 r8) {
		System.out.println("I am santro, " + san.epfw.epv.vehicle.Owner
				+ " collided with Audi r8, " + r8.epfw.epv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		r8.epfw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1 - 0.5 * r1)
				+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));

	}

	public static void collide13(Santro san, SuzukiHayabusa haya) {
		System.out.println("I am santro, " + san.epfw.epv.vehicle.Owner
				+ " collided with Hayabusa, " + haya.eptw.epv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		haya.eptw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1 - 0.5 * r1)
				+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
	}

	public static void collide14(Santro san, YamahaFZS fzs) {
		System.out.println("I am santro, " + san.epfw.epv.vehicle.Owner
				+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		fzs.eptw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1 - 0.5 * r1)
				+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
	}

	public static void collide15(Santro san, HeroHercules hh) {
		System.out.println("I am santro, " + san.epfw.epv.vehicle.Owner
				+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		hh.hpv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1 - 0.5 * r1)
				+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
	}

	public static void collide21(AudiR8 r8, Santro san) {
		try {
			if (r8.epfw.pack.IsExpired) {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1 - 0.5 * r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide26(AudiR8 r8, Firefox br) {
		try {
			if (r8.epfw.pack.IsExpired) {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1 - 0.5 * r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}
	}

	public static void collide23(AudiR8 r8, SuzukiHayabusa haya) {
		try {
			if (r8.epfw.pack.IsExpired) {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1 - 0.5 * r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}
	}

	public static void collide24(AudiR8 r8, YamahaFZS fzs) {
		try {
			if (r8.epfw.pack.IsExpired) {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1 - 0.5 * r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide25(AudiR8 r8, HeroHercules hh) {
		try {
			if (r8.epfw.pack.IsExpired) {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Audi R8, " + r8.epfw.epv.vehicle.Owner
						+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
				r8.epfw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1 - 0.5 * r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide31(SuzukiHayabusa haya, Santro san) {
		System.out.println("I am HAYABUSA, " + haya.eptw.epv.vehicle.Owner
				+ " collided with Santro, " + san.epfw.epv.vehicle.Owner);
		san.epfw.epv.vehicle.damage = r1;
		san.epfw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1) + "\n Damages Oncoming: "
				+ (r2 - 0.8 * r2));

	}

	public static void collide32(SuzukiHayabusa haya, AudiR8 r8) {
		System.out.println("I am HAYABUSA, " + haya.eptw.epv.vehicle.Owner
				+ " collided with R8 , " + r8.epfw.epv.vehicle.Owner);
		haya.eptw.epv.vehicle.damage = r1;
		r8.epfw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1) + "\n Damages Oncoming: "
				+ (r2 - 0.8 * r2));

	}

	public static void collide36(SuzukiHayabusa haya, Firefox br) {
		System.out.println("I am HAYABUSA, " + haya.eptw.epv.vehicle.Owner
				+ " collided with Firefox , " + br.hpv.vehicle.Owner);
		haya.eptw.epv.vehicle.damage = r1;
		br.hpv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1) + "\n Damages Oncoming: "
				+ (r2 - 0.8 * r2));

	}

	public static void collide34(SuzukiHayabusa haya, YamahaFZS fzs) {
		System.out.println("I am HAYABUSA, " + haya.eptw.epv.vehicle.Owner
				+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
		haya.eptw.epv.vehicle.damage = r1;
		fzs.eptw.epv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1) + "\n Damages Oncoming: "
				+ (r2 - 0.8 * r2));

	}

	public static void collide35(SuzukiHayabusa haya, HeroHercules hh) {
		System.out.println("I am HAYABUSA, " + haya.eptw.epv.vehicle.Owner
				+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
		haya.eptw.epv.vehicle.damage = r1;
		hh.hpv.vehicle.damage = r2;
		System.out
				.println("Damages self: " + r1 + "\n Damages Oncoming: " + r2);
		System.out.println("AFTER SETTLEMENT : ");
		System.out.println("Damages self: " + (r1) + "\n Damages Oncoming: "
				+ (r2 - 0.8 * r2));

	}

	public static void collide41(YamahaFZS fzs, Santro san) {
		try {
			if (fzs.eptw.third.IsExpired) {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide42(YamahaFZS fzs, AudiR8 r8) {
		try {
			if (fzs.eptw.third.IsExpired) {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide43(YamahaFZS fzs, SuzukiHayabusa haya) {
		try {
			if (fzs.eptw.third.IsExpired) {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));

			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}
	}

	public static void collide46(YamahaFZS fzs, Firefox br) {

		try {
			if (fzs.eptw.third.IsExpired) {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));

			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}
	}

	public static void collide45(YamahaFZS fzs, HeroHercules hh) {

		try {
			if (fzs.eptw.third.IsExpired) {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am FZS, " + fzs.eptw.epv.vehicle.Owner
						+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
				fzs.eptw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2 - 0.8 * r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}
	}

	public static void collide51(HeroHercules hh, Santro san) {
		try {
			if (hh.hpv.no.HasNo) {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				san.epfw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				san.epfw.epv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}
	}

	public static void collide52(HeroHercules hh, AudiR8 r8) {

		try {
			if (hh.hpv.no.HasNo) {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}
	}

	public static void collide53(HeroHercules hh, SuzukiHayabusa haya) {
		try {
			if (hh.hpv.no.HasNo) {
				System.out.println("I am Herocules, " + hh.hpv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide54(HeroHercules hh, YamahaFZS fzs) {
		try {
			if (hh.hpv.no.HasNo) {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide56(HeroHercules hh, Firefox br) {
		try {
			if (hh.hpv.no.HasNo) {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Hercules, " + hh.hpv.vehicle.Owner
						+ " collided with Firefox, " + br.hpv.vehicle.Owner);
				hh.hpv.vehicle.damage = r1;
				br.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide61(Firefox br, Santro san) {
		try {
			if (br.hpv.no.HasNo) {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Santro, "
						+ san.epfw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				san.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide62(Firefox br, AudiR8 r8) {
		try {
			if (br.hpv.no.HasNo) {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Audi R8, "
						+ r8.epfw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				r8.epfw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}

	public static void collide63(Firefox br, SuzukiHayabusa haya) {
		try {
			if (br.hpv.no.HasNo) {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Hayabusa, "
						+ haya.eptw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Audi R8, "
						+ haya.eptw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				haya.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}
	}

	public static void collide64(Firefox br, YamahaFZS fzs) {
		try {
			if (br.hpv.no.HasNo) {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with FZS, " + fzs.eptw.epv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				fzs.eptw.epv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}
	}

	public static void collide65(Firefox br, HeroHercules hh) {

		try {
			if (br.hpv.no.HasNo) {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Herocules, " + hh.hpv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("NO SETTLEMENT : ");
				throw new PolicyExpiredException(
						"\nNO POLICY !!ENGINE POWERED VEHICLE\n "
								+ "GET READY FOR A FIGHT !!! \n");
			} else {
				System.out.println("I am Firefox, " + br.hpv.vehicle.Owner
						+ " collided with Hercules, " + hh.hpv.vehicle.Owner);
				br.hpv.vehicle.damage = r1;
				hh.hpv.vehicle.damage = r2;
				System.out.println("Damages self: " + r1
						+ "\n Damages Oncoming: " + r2);
				System.out.println("AFTER SETTLEMENT : ");
				System.out.println("Damages self: " + (r1)
						+ "\n Damages Oncoming: " + (r2));
			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();

		}

	}
}
