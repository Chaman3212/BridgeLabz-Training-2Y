
    import java.util.Scanner;

    public class StringPracticeSet {

        // 1️⃣ Compare Two Strings using charAt() and equals()
        static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
            }
            return true;
        }

        // 2️⃣ Create substring manually using charAt()
        static String createSubstring(String text, int start, int end) {
            String sub = "";
            for (int i = start; i < end; i++) {
                sub += text.charAt(i);
            }
            return sub;
        }

        // 3️⃣ Return all characters manually (like toCharArray)
        static char[] manualToCharArray(String text) {
            char[] arr = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                arr[i] = text.charAt(i);
            }
            return arr;
        }

        // Compare two char arrays
        static boolean compareCharArrays(char[] a1, char[] a2) {
            if (a1.length != a2.length) return false;
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) return false;
            }
            return true;
        }

        // 4️⃣ Demonstrate NullPointerException
        static void generateNullPointerException() {
            String text = null;
            System.out.println(text.length()); // generates exception
        }

        static void handleNullPointerException() {
            try {
                String text = null;
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("Handled NullPointerException: " + e.getMessage());
            }
        }

        // 5️⃣ Demonstrate StringIndexOutOfBoundsException
        static void generateStringIndexOutOfBounds(String text) {
            System.out.println(text.charAt(text.length())); // beyond limit
        }

        static void handleStringIndexOutOfBounds(String text) {
            try {
                System.out.println(text.charAt(text.length()));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
            }
        }

        // 6️⃣ Demonstrate IllegalArgumentException
        static void generateIllegalArgument(String text) {
            System.out.println(text.substring(5, 2)); // start > end
        }

        static void handleIllegalArgument(String text) {
            try {
                System.out.println(text.substring(5, 2));
            } catch (IllegalArgumentException e) {
                System.out.println("Handled IllegalArgumentException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Handled RuntimeException: " + e.getMessage());
            }
        }

        // 7️⃣ Demonstrate NumberFormatException
        static void generateNumberFormat(String text) {
            int num = Integer.parseInt(text); // invalid number
            System.out.println("Parsed number: " + num);
        }

        static void handleNumberFormat(String text) {
            try {
                int num = Integer.parseInt(text);
                System.out.println("Parsed number: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Handled NumberFormatException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Handled RuntimeException: " + e.getMessage());
            }
        }

        // 8️⃣ Demonstrate ArrayIndexOutOfBoundsException
        static void generateArrayIndexOutOfBounds(String[] names) {
            System.out.println(names[names.length]); // beyond index
        }

        static void handleArrayIndexOutOfBounds(String[] names) {
            try {
                System.out.println(names[names.length]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Handled RuntimeException: " + e.getMessage());
            }
        }

        // 9️⃣ Convert to Uppercase manually using charAt()
        static String toUpperCaseManual(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c = (char) (c - 32);
                }
                result += c;
            }
            return result;
        }

        // 🔟 Convert to Lowercase manually using charAt()
        static String toLowerCaseManual(String text) {
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    c = (char) (c + 32);
                }
                result += c;
            }
            return result;
        }

        // 🧮 MAIN METHOD
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Task 1 - Compare Strings
            System.out.println("Enter two strings to compare:");
            String s1 = sc.next();
            String s2 = sc.next();
            boolean userCompare = compareStrings(s1, s2);
            boolean builtInCompare = s1.equals(s2);
            System.out.println("User-defined compare: " + userCompare);
            System.out.println("Built-in equals(): " + builtInCompare);

            // Task 2 - Create Substring
            System.out.println("\nEnter a string for substring task:");
            String text = sc.next();
            System.out.println("Enter start index:");
            int start = sc.nextInt();
            System.out.println("Enter end index:");
            int end = sc.nextInt();
            String subManual = createSubstring(text, start, end);
            String subBuiltIn = text.substring(start, end);
            System.out.println("Manual Substring: " + subManual);
            System.out.println("Built-in Substring: " + subBuiltIn);
            System.out.println("Compare Result: " + compareStrings(subManual, subBuiltIn));

            // Task 3 - Convert to Char Array
            System.out.println("\nEnter a string to convert to char array:");
            String charText = sc.next();
            char[] manualArray = manualToCharArray(charText);
            char[] builtInArray = charText.toCharArray();
            System.out.println("Arrays Equal: " + compareCharArrays(manualArray, builtInArray));

            // Task 4 - NullPointerException
            System.out.println("\n--- NullPointerException Demo ---");
            // generateNullPointerException(); // Uncomment to see actual crash
            handleNullPointerException();

            // Task 5 - StringIndexOutOfBoundsException
            System.out.println("\n--- StringIndexOutOfBoundsException Demo ---");
            // generateStringIndexOutOfBounds(text); // Uncomment to see crash
            handleStringIndexOutOfBounds(text);

            // Task 6 - IllegalArgumentException
            System.out.println("\n--- IllegalArgumentException Demo ---");
            // generateIllegalArgument(text); // Uncomment to see crash
            handleIllegalArgument(text);

            // Task 7 - NumberFormatException
            System.out.println("\n--- NumberFormatException Demo ---");
            System.out.println("Enter a text to convert to number:");
            String numText = sc.next();
            // generateNumberFormat(numText); // Uncomment to see crash
            handleNumberFormat(numText);

            // Task 8 - ArrayIndexOutOfBoundsException
            System.out.println("\n--- ArrayIndexOutOfBoundsException Demo ---");
            String[] names = {"A", "B", "C"};
            // generateArrayIndexOutOfBounds(names); // Uncomment to see crash
            handleArrayIndexOutOfBounds(names);

            // Task 9 - Uppercase Conversion
            System.out.println("\nEnter a text to convert to uppercase:");
            sc.nextLine(); // clear buffer
            String upperText = sc.nextLine();
            String manualUpper = toUpperCaseManual(upperText);
            String builtInUpper = upperText.toUpperCase();
            System.out.println("Manual Uppercase: " + manualUpper);
            System.out.println("Built-in Uppercase: " + builtInUpper);
            System.out.println("Compare: " + compareStrings(manualUpper, builtInUpper));

            // Task 10 - Lowercase Conversion
            System.out.println("\nEnter a text to convert to lowercase:");
            String lowerText = sc.nextLine();
            String manualLower = toLowerCaseManual(lowerText);
            String builtInLower = lowerText.toLowerCase();
            System.out.println("Manual Lowercase: " + manualLower);
            System.out.println("Built-in Lowercase: " + builtInLower);
            System.out.println("Compare: " + compareStrings(manualLower, builtInLower));

            sc.close();
        }
    }


