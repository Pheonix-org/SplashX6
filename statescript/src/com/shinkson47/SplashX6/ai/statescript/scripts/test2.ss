name = TestScript;
description = "test";
default = PlusState;


code {
	public static int i = 0;

	private static void printi() {
		System.out.println(i);
	}
}

state MinusState {
	behaviour {
		i--;
		printi();
	}
}

state PlusState {
	behaviour {
		i++;
		printi();
	}
}

switch from MinusState to PlusState  if (i < 1);
switch from PlusState  to MinusState if (i > 5);