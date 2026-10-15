package e2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12752a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f12753b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, e2.f] */
    static {
        AtomicBoolean atomicBoolean = h.f12754a;
        f12752a = 12451000;
        f12753b = new Object();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = h.f12754a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i4, Context context, String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC1799b.j(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f12752a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(m2.c.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(11:52|(1:54)(1:119)|55|(2:115|116)(1:57)|58|59|60|(1:62)(2:(2:85|(1:87))|(4:93|(1:95)(1:112)|(1:97)|(1:99)(4:100|(2:106|107)|102|(1:104)(1:105)))(1:92))|63|(2:(5:66|67|68|69|(2:70|(2:72|(1:74)(1:75))(2:76|77)))|80)(0)|(1:82)(1:83)))|120|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b8, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f.c(android.content.Context, int):int");
    }
}
