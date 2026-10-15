package t2;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.ads.Gh;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997d {
    public static final y d = y.n(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* renamed from: a, reason: collision with root package name */
    public final Application f14890a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f14891b;
    public final HashSet c;

    public C1997d(Application application) {
        this.f14890a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f14891b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String str;
        Set<String> stringSet = this.f14891b.getStringSet("stored_info", B.f14852w);
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f14890a;
            Gh a4 = t.a(application, str2);
            if (a4 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences(a4.f5313o, 0).getAll().get(a4.f5314p);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }
}
