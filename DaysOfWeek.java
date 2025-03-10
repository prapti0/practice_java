

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); // Months are zero-based in Calendar class
        
        // Get the day of the week in uppercase
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1; // Calendar.DAY_OF_WEEK returns 1 for SUNDAY
        
        return daysOfWeek[dayOfWeek];

    }

}

