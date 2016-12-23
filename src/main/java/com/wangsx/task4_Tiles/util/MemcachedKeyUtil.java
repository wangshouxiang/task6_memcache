package com.wangsx.task4_Tiles.util;

public class MemcachedKeyUtil {
	private static final String STUDENT_KEY_PREFIX = "students_";
	private static final String PROFESSION_KEY_PREFIX = "profession_";
	private static final String CLASSES_KEY_PREFIX = "classes_";
	public static String getStudentsKey(long studentId) {
		return STUDENT_KEY_PREFIX + studentId;
	}
	public static String getProfessionKey(long professionId) {
		return PROFESSION_KEY_PREFIX + professionId;
	}
	public static String getClassesKey(long classesId) {
		return CLASSES_KEY_PREFIX + classesId;
	}
}
