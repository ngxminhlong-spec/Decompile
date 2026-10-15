package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ez, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0587ez {

    /* renamed from: a, reason: collision with root package name */
    public static String f8661a;

    public static int a(byte[] bArr, int i4, C0544dz c0544dz) {
        int t4 = t(bArr, i4, c0544dz);
        int i5 = c0544dz.f8529a;
        if (i5 < 0) {
            throw Oz.d();
        }
        if (i5 > bArr.length - t4) {
            throw Oz.f();
        }
        if (i5 == 0) {
            c0544dz.c = AbstractC0886lz.f9510p;
            return t4;
        }
        c0544dz.c = AbstractC0886lz.A(bArr, t4, i5);
        return t4 + i5;
    }

    public static String b(Context context) {
        String str = f8661a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f8661a = null;
        } else if (arrayList.size() == 1) {
            f8661a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    f8661a = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f8661a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f8661a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f8661a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f8661a = "com.google.android.apps.chrome";
            }
        }
        return f8661a;
    }

    public static String c(AbstractC0886lz abstractC0886lz) {
        StringBuilder sb = new StringBuilder(abstractC0886lz.l());
        for (int i4 = 0; i4 < abstractC0886lz.l(); i4++) {
            byte i5 = abstractC0886lz.i(i4);
            if (i5 == 34) {
                sb.append("\\\"");
            } else if (i5 == 39) {
                sb.append("\\'");
            } else if (i5 != 92) {
                switch (i5) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (i5 < 32 || i5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((i5 >>> 6) & 3) + 48));
                            sb.append((char) (((i5 >>> 3) & 7) + 48));
                            sb.append((char) ((i5 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) i5);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static Date d(long j4) {
        return new Date((j4 - 2082844800) * 1000);
    }

    public static /* bridge */ /* synthetic */ void e(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) {
        if (!s(b5)) {
            if ((((b5 + 112) + (b4 << 28)) >> 30) == 0 && !s(b6) && !s(b7)) {
                int i5 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
                cArr[i4] = (char) ((i5 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
                return;
            }
        }
        throw Oz.b();
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ void h(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    public static int j(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public static AbstractC0587ez k(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C1156sB(cls.getSimpleName(), 0) : new C1156sB(cls.getSimpleName(), 1);
    }

    public static LinkedHashMap l(int i4) {
        return new LinkedHashMap(i4 < 3 ? i4 + 1 : i4 < 1073741824 ? (int) ((i4 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static /* bridge */ /* synthetic */ void m(byte b4, byte b5, byte b6, char[] cArr, int i4) {
        if (!s(b5)) {
            if (b4 == -32) {
                if (b5 >= -96) {
                    b4 = -32;
                }
            }
            if (b4 == -19) {
                if (b5 < -96) {
                    b4 = -19;
                }
            }
            if (!s(b6)) {
                cArr[i4] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                return;
            }
        }
        throw Oz.b();
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static /* bridge */ /* synthetic */ void o(byte b4, byte b5, char[] cArr, int i4) {
        if (b4 < -62 || s(b5)) {
            throw Oz.b();
        }
        cArr[i4] = (char) (((b4 & 31) << 6) | (b5 & 63));
    }

    public static void p(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static int q(InterfaceC0984oA interfaceC0984oA, int i4, byte[] bArr, int i5, int i6, Lz lz, C0544dz c0544dz) {
        Dz a4 = interfaceC0984oA.a();
        InterfaceC0984oA interfaceC0984oA2 = interfaceC0984oA;
        byte[] bArr2 = bArr;
        int i7 = i6;
        C0544dz c0544dz2 = c0544dz;
        int x4 = x(a4, interfaceC0984oA2, bArr2, i5, i7, c0544dz2);
        interfaceC0984oA2.b(a4);
        c0544dz2.c = a4;
        lz.add(a4);
        while (x4 < i7) {
            C0544dz c0544dz3 = c0544dz2;
            int i8 = i7;
            int t4 = t(bArr2, x4, c0544dz3);
            if (i4 != c0544dz3.f8529a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC0984oA interfaceC0984oA3 = interfaceC0984oA2;
            Dz a5 = interfaceC0984oA3.a();
            x4 = x(a5, interfaceC0984oA3, bArr3, t4, i8, c0544dz3);
            interfaceC0984oA2 = interfaceC0984oA3;
            bArr2 = bArr3;
            i7 = i8;
            c0544dz2 = c0544dz3;
            interfaceC0984oA2.b(a5);
            c0544dz2.c = a5;
            lz.add(a5);
        }
        return x4;
    }

    public static int r(int i4, byte[] bArr, int i5, int i6, C1155sA c1155sA, C0544dz c0544dz) {
        if ((i4 >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int w2 = w(bArr, i5, c0544dz);
            c1155sA.c(i4, Long.valueOf(c0544dz.f8530b));
            return w2;
        }
        if (i7 == 1) {
            c1155sA.c(i4, Long.valueOf(y(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int t4 = t(bArr, i5, c0544dz);
            int i8 = c0544dz.f8529a;
            if (i8 < 0) {
                throw Oz.d();
            }
            if (i8 > bArr.length - t4) {
                throw Oz.f();
            }
            if (i8 == 0) {
                c1155sA.c(i4, AbstractC0886lz.f9510p);
            } else {
                c1155sA.c(i4, AbstractC0886lz.A(bArr, t4, i8));
            }
            return t4 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c1155sA.c(i4, Integer.valueOf(j(i5, bArr)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        C1155sA b4 = C1155sA.b();
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int t5 = t(bArr, i5, c0544dz);
            i10 = c0544dz.f8529a;
            if (i10 == i9) {
                i5 = t5;
                break;
            }
            i5 = r(i10, bArr, t5, i6, b4, c0544dz);
        }
        if (i5 > i6 || i10 != i9) {
            throw Oz.e();
        }
        c1155sA.c(i4, b4);
        return i5;
    }

    public static boolean s(byte b4) {
        return b4 > -65;
    }

    public static int t(byte[] bArr, int i4, C0544dz c0544dz) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return u(b4, bArr, i5, c0544dz);
        }
        c0544dz.f8529a = b4;
        return i5;
    }

    public static int u(int i4, byte[] bArr, int i5, C0544dz c0544dz) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            c0544dz.f8529a = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            c0544dz.f8529a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0544dz.f8529a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0544dz.f8529a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0544dz.f8529a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int v(int i4, byte[] bArr, int i5, int i6, Lz lz, C0544dz c0544dz) {
        Ez ez = (Ez) lz;
        int t4 = t(bArr, i5, c0544dz);
        ez.h(c0544dz.f8529a);
        while (t4 < i6) {
            int t5 = t(bArr, t4, c0544dz);
            if (i4 != c0544dz.f8529a) {
                break;
            }
            t4 = t(bArr, t5, c0544dz);
            ez.h(c0544dz.f8529a);
        }
        return t4;
    }

    public static int w(byte[] bArr, int i4, C0544dz c0544dz) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            c0544dz.f8530b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        c0544dz.f8530b = j5;
        return i6;
    }

    public static int x(Object obj, InterfaceC0984oA interfaceC0984oA, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = u(i7, bArr, i6, c0544dz);
            i7 = c0544dz.f8529a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw Oz.f();
        }
        int i9 = i8 + i7;
        interfaceC0984oA.j(obj, bArr, i8, i9, c0544dz);
        c0544dz.c = obj;
        return i9;
    }

    public static long y(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    public abstract void g(String str);

    public abstract void i(byte[] bArr, int i4, int i5);
}
