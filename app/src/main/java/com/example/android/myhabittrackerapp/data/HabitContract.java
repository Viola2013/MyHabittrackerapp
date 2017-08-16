
package com.example.android.myhabittrackerapp.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Habit app.
 */
public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class HabitEntry implements BaseColumns {

        /**
         * Name of database table for Habits
         */
        public final static String TABLE_NAME = "Habits";

        /**
         * ID number for the habit (only for use in the database table).
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the user.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_USER_NAME = "name";

        /**
         * Amount of steps taken
         * <p>
         * Type: integer
         */
        public final static String COLUMN_STEPS = "steps";


        /**
         * Distance user walked
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_DISTANCE = "distance";

    }

}