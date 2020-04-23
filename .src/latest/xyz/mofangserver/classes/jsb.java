package xyz.mofangserver.classes;

import java.util.*;
import xyz.mofangserver.quote.*;;

public final class jsb implements finalDatas , finalStrings , functions {
	@SuppressWarnings("resource")
	public final static void main(String[] args) {
		Random MR = new Random();
		dynamicDatas.Rs = MR.nextInt(4);
		Scanner cont = new Scanner(System.in);
		functions.dspstart();
		dynamicDatas.enters = cont.nextInt();
		functions.dsppd();
		if (dynamicDatas.enters == 1) {
			if (dynamicDatas.Rs == 1) {
				functions.dspping();
			} else {
				if (dynamicDatas.Rs == 2) {
					functions.dsplose();
				} else {
					if (dynamicDatas.Rs == 3) {
						functions.dspwin();
					}
				}
			}
		} else {
			if (dynamicDatas.enters == 2) {
				if (dynamicDatas.Rs == 1) {
					functions.dspwin();
				} else {
					if (dynamicDatas.Rs == 2) {
						functions.dspping();
					} else {
						if (dynamicDatas.Rs == 3) {
							functions.dsplose();
						}
					}
				}
			} else {
				if (dynamicDatas.enters == 3) {
					if (dynamicDatas.Rs == 1) {
						functions.dsplose();
					} else {
						if (dynamicDatas.Rs == 2) {
							functions.dspwin();
						} else {
							if (dynamicDatas.Rs == 3) {
								functions.dspping();
							}
						}
					}
				}
			}
		}
	}
}
