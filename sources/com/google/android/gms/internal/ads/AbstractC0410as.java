package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.as, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0410as {

    /* renamed from: a, reason: collision with root package name */
    public static final ClipData f8171a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i4) {
        boolean b4 = b(0, 17);
        boolean b5 = b(0, 9);
        boolean b6 = b(0, 5);
        boolean b7 = b(0, 3);
        Bs.d0("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            Bs.d0("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i4, 67108864));
        } else {
            Bs.d0("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i4, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i4, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b7 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b5 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b6 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b4 && intent2.getClipData() == null) {
                intent2.setClipData(f8171a);
            }
        }
        return intent2;
    }

    public static boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
