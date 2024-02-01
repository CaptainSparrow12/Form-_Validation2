package com.cognifyz;

import java.util.ArrayList;
import java.util.List;

public class TemporaryStorage {
	private static List<FormData> formDataList = new ArrayList<>();

    public static void addFormData(FormData data) {
        formDataList.add(data);
    }

    public static List<FormData> getFormDataList() {
        return formDataList;
    }

}
