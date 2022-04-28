/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.lukas.serialisable;

import com.shinkson47.SplashX6.game.GameDataKt;
import com.shinkson47.SplashX6.game._GameData;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.JComponent;

public class Crawler {
    public static boolean crawlRecursively(Field field, HashSet<Class<?>> alreadyCrawled, HashMap<Field, HashSet<String>> badFields) {
        if (alreadyCrawled.contains(field.getType())) {
            return !badFields.keySet().contains(field);
        }

        alreadyCrawled.add(field.getType());

        if (Modifier.isStatic(field.getModifiers())
                || Modifier.isTransient(field.getModifiers())
                || field.getType().isPrimitive()) {
            return true;
        } else if (Serializable.class.isAssignableFrom(field.getType())) {
            boolean allGood = true;

            for (Field f : field.getType().getDeclaredFields()) {
                boolean isGood = crawlRecursively(f, alreadyCrawled, badFields);
                if (!isGood) {
                    if (!badFields.containsKey(field)) {
                        badFields.put(field, new HashSet<>());
                    }
                    badFields.get(field).add(f.getType().getSimpleName() + " " + f.getName());
                    allGood = false;
                }
            }

            return allGood;
        } else {
            if (!badFields.containsKey(field)) {
                badFields.put(field, new HashSet<>());
            }

            return false;
        }
    }

    public static HashMap<Field, HashSet<String>> initiateCrawling(Collection<Class<?>> roots) {
        HashMap<Field, HashSet<String>> badFields = new HashMap<>();

        for (Class<?> root : roots) {
            for (Field f : root.getDeclaredFields()) {
                crawlRecursively(f, new HashSet<>(), badFields);
            }
        }

        return badFields;
    }

    public static void main(String[] args) {
        LinkedList<Class<?>> roots = new LinkedList<>();
        roots.add(_GameData.class); // ADD YOUR CLASSES HERE.
        roots.add(GameDataKt.class); // ADD YOUR CLASSES HERE.
        HashMap<Field, HashSet<String>> badFields = initiateCrawling(roots);

        if (badFields.keySet().size() == 0) {
            System.out.println("All fields are serializable (not having checked the given class(es) themselves).");
        } else {
            System.err.println("The following fields are not serializable in the class tree(s) given by " + roots + ":");
        }

        for (Field field : badFields.keySet()) {
            System.err.println("<UnSer> "
                    + field.getType().getSimpleName() + " "
                    + field.getName() + " ("
                    + field.getDeclaringClass().getName() + ") => " + badFields.get(field));
        }
    }
}