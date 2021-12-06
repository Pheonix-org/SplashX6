package gen.shinkson47.SplashX6.ai.statescript;

import com.shinkson47.SplashX6.ai.StateMachine;

/**
 * h1>TestScript</h1>test
 */
class TestScript extends StateMachine {
  TestScript() {
    // State : MinusState
               addState(new State(
                       () -> {
        	i--;
        	printi();
        },
                       this,
                       null,
                       null
                   ));
    // State : PlusState
               addState(new State(
                       () -> {
        	i++;
        	printi();
        },
                       this,
                       null,
                       null
                   ));
    // Switch : from MinusState to PlusState
    registerSwitchCondition(0, 1, unit -> i < 1);
    // Switch : from PlusState to MinusState
    registerSwitchCondition(1, 0, unit -> i > 5);
    defaultState(1);;
  }

	public static int i = 0;

	private static void printi() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		new TestScript().run(100);
	}
}