package E;

import B0.r;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import b0.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m2.AbstractC1806a;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f680a = new l0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a f681b = new Object();

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, B0.r] */
    public static r a(Context context, List list) {
        String str;
        Typeface c;
        AbstractC1806a.f("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                e eVar = (e) list.get(i4);
                if (Build.VERSION.SDK_INT < 31 || (c = A.g.c((str = eVar.f684e))) == null || A.g.d(c) == null) {
                    ProviderInfo b4 = b(context.getPackageManager(), eVar, context.getResources());
                    if (b4 == null) {
                        return new r(1, (byte) 0);
                    }
                    arrayList.add(c(context, eVar, b4.authority));
                } else {
                    arrayList.add(new j[]{new j(str, eVar.f685f)});
                }
            }
            ?? obj = new Object();
            obj.f112o = 0;
            obj.f113p = arrayList;
            return obj;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, E.c] */
    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        a aVar = f681b;
        l0 l0Var = f680a;
        AbstractC1806a.f("FontProvider.getProvider");
        try {
            List list = eVar.d;
            String str = eVar.f682a;
            String str2 = eVar.f683b;
            if (list == null) {
                list = AbstractC2123b.k(resources, 0);
            }
            ?? obj = new Object();
            obj.f678a = str;
            obj.f679b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) l0Var.g(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i4 = 0; i4 < list.size(); i4++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i4));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                            break;
                        }
                    }
                    l0Var.k(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static j[] c(Context context, e eVar, String str) {
        AbstractC1806a.f("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            b dVar = Build.VERSION.SDK_INT < 24 ? new D3.d(context, build) : new x0.f(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC1806a.f("ContentQueryWrapper.query");
                try {
                    cursor = dVar.a(build, strArr, new String[]{eVar.c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    dVar.close();
                    return (j[]) arrayList.toArray(new j[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                dVar.close();
                throw th;
            }
        } finally {
        }
    }
}
