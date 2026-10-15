package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6431a;

    /* renamed from: b, reason: collision with root package name */
    public int f6432b;
    public Object c;
    public Object d;

    public O2(int i4, ArrayList arrayList, int i5, P2 p22) {
        this.f6431a = i4;
        this.c = arrayList;
        this.f6432b = i5;
        this.d = p22;
    }

    public /* synthetic */ O2(Or or, byte[] bArr) {
        this.d = or;
        this.c = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D2.b a() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O2.a():D2.b");
    }

    public synchronized Object b(long j4) {
        Object obj;
        obj = null;
        while (this.f6432b > 0 && j4 - ((long[]) this.c)[this.f6431a] >= 0) {
            obj = f();
        }
        return obj;
    }

    public synchronized void c() {
        try {
            Or or = (Or) this.d;
            if (or.f6531b) {
                or.f6530a.T2((byte[]) this.c);
                ((Or) this.d).f6530a.J0(this.f6431a);
                ((Or) this.d).f6530a.v(this.f6432b);
                ((Or) this.d).f6530a.i3();
                ((Or) this.d).f6530a.d();
            }
        } catch (RemoteException e4) {
            Log.d("GASS", "Clearcut log failed", e4);
        }
    }

    public synchronized void d(long j4, Object obj) {
        try {
            if (this.f6432b > 0) {
                if (j4 <= ((long[]) this.c)[((this.f6431a + r0) - 1) % ((Object[]) this.d).length]) {
                    e();
                }
            }
            int length = ((Object[]) this.d).length;
            if (this.f6432b >= length) {
                int i4 = length + length;
                long[] jArr = new long[i4];
                Object[] objArr = new Object[i4];
                int i5 = this.f6431a;
                int i6 = length - i5;
                System.arraycopy((long[]) this.c, i5, jArr, 0, i6);
                System.arraycopy((Object[]) this.d, this.f6431a, objArr, 0, i6);
                int i7 = this.f6431a;
                if (i7 > 0) {
                    System.arraycopy((long[]) this.c, 0, jArr, i6, i7);
                    System.arraycopy((Object[]) this.d, 0, objArr, i6, this.f6431a);
                }
                this.c = jArr;
                this.d = objArr;
                this.f6431a = 0;
            }
            int i8 = this.f6431a;
            int i9 = this.f6432b;
            Object[] objArr2 = (Object[]) this.d;
            int length2 = (i8 + i9) % objArr2.length;
            ((long[]) this.c)[length2] = j4;
            objArr2[length2] = obj;
            this.f6432b = i9 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e() {
        this.f6431a = 0;
        this.f6432b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public Object f() {
        Zf.X(this.f6432b > 0);
        Object[] objArr = (Object[]) this.d;
        int i4 = this.f6431a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f6431a = (i4 + 1) % objArr.length;
        this.f6432b--;
        return obj;
    }
}
