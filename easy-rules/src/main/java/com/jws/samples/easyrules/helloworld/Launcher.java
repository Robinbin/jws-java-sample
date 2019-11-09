package com.jws.samples.easyrules.helloworld;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

public class Launcher {
    public static void main(String[] args) {
        HelloWorldRule rule = new HelloWorldRule();
        Rules rules = new Rules();
        rules.register(rule);

        Facts facts = new Facts();

        RulesEngine engine = new DefaultRulesEngine();
        engine.fire(rules, facts);
    }
}
