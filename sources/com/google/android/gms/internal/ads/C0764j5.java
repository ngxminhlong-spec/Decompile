package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764j5 {

    /* renamed from: a, reason: collision with root package name */
    public final A2.o f9123a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f9124b;
    public final boolean c;

    public C0764j5() {
        this.f9124b = G5.x();
        this.c = false;
        this.f9123a = new A2.o(5);
    }

    public C0764j5(A2.o oVar) {
        this.f9124b = G5.x();
        this.f9123a = oVar;
        this.c = ((Boolean) O1.r.d.c.a(AbstractC1066q6.l4)).booleanValue();
    }

    public final synchronized void a(InterfaceC0723i5 interfaceC0723i5) {
        if (this.c) {
            try {
                interfaceC0723i5.j(this.f9124b);
            } catch (NullPointerException e4) {
                N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
            }
        }
    }

    public final synchronized void b(int i4) {
        if (this.c) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.m4)).booleanValue()) {
                d(i4);
            } else {
                e(i4);
            }
        }
    }

    public final synchronized String c(int i4) {
        StringBuilder sb;
        String y = ((G5) this.f9124b.f4561p).y();
        N1.n.f1204A.f1212j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((G5) this.f9124b.b()).e(), 3);
        sb = new StringBuilder("id=");
        sb.append(y);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i4 - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public final synchronized void d(int i4) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(c(i4).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        Q1.I.w("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    Q1.I.w("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        Q1.I.w("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    Q1.I.w("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            Q1.I.w("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i4) {
        F5 f5 = this.f9124b;
        f5.d();
        G5.B((G5) f5.f4561p);
        ArrayList v4 = Q1.N.v();
        f5.d();
        G5.A((G5) f5.f4561p, v4);
        J2 j22 = new J2(this.f9123a, ((G5) this.f9124b.b()).e());
        int i5 = i4 - 1;
        j22.f5779p = i5;
        j22.m();
        Q1.I.w("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i5, 10))));
    }
}
