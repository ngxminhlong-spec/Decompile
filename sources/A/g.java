package A;

import C0.C;
import E.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import b0.l0;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.play_billing.B;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m2.AbstractC1806a;
import z.AbstractC2123b;
import z.C2126e;
import z.C2128g;
import z.InterfaceC2125d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final B f5a;

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f6b;
    public static Paint c;

    static {
        AbstractC1806a.f("TypefaceCompat static init");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            f5a = new B();
        } else if (i4 >= 29) {
            f5a = new B();
        } else if (i4 >= 28) {
            f5a = new j();
        } else if (i4 >= 26) {
            f5a = new j();
        } else {
            if (i4 >= 24) {
                Method method = i.f14j;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f5a = new B();
                }
            }
            f5a = new B();
        }
        f6b = new l0(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, InterfaceC2125d interfaceC2125d, Resources resources, int i4, String str, int i5, int i6, AbstractC2123b abstractC2123b, boolean z4) {
        Typeface k3;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i7 = 7;
        int i8 = -3;
        if (interfaceC2125d instanceof C2128g) {
            C2128g c2128g = (C2128g) interfaceC2125d;
            String str2 = c2128g.d;
            k3 = null;
            int i9 = 1;
            boolean z5 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = c2128g.f15932a;
                if (arrayList.size() == 1) {
                    build = c(((E.e) arrayList.get(0)).f684e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        break;
                                    }
                                    E.e eVar = (E.e) arrayList.get(i11);
                                    if (i11 == arrayList.size() - 1 && TextUtils.isEmpty(eVar.f685f)) {
                                        customFallbackBuilder.setSystemFallback(eVar.f684e);
                                        break;
                                    }
                                    String str3 = eVar.f684e;
                                    String str4 = eVar.f685f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar.f684e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        try {
                                            b.n();
                                            b.x();
                                            fontVariationSettings = f.d(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = b.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    } else {
                                        build3 = b.h(d).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = b.d(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i11++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((E.e) arrayList.get(i10)).f684e) == null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (abstractC2123b != null) {
                    new Handler(Looper.getMainLooper()).post(new C1.d(i7, abstractC2123b, build));
                }
                f6b.k(b(resources, i4, str, i5, i6), build);
                return build;
            }
            Object[] objArr3 = !z4 ? abstractC2123b != null : c2128g.c != 0;
            int i12 = z4 ? c2128g.f15933b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            D3.d dVar = new D3.d(i9, z5);
            dVar.f677p = abstractC2123b;
            ArrayList arrayList2 = c2128g.f15932a;
            E.m mVar = new E.m(handler, 0);
            C0783ji c0783ji = new C0783ji(i7, dVar, mVar);
            int i13 = 19;
            if (objArr3 != true) {
                String a4 = E.i.a(i6, arrayList2);
                Typeface typeface = (Typeface) E.i.f694a.g(a4);
                if (typeface != null) {
                    mVar.execute(new Nu(i13, dVar, typeface));
                    k3 = typeface;
                } else {
                    E.g gVar = new E.g(objArr2 == true ? 1 : 0, c0783ji);
                    synchronized (E.i.c) {
                        try {
                            r.i iVar = E.i.d;
                            ArrayList arrayList3 = (ArrayList) iVar.get(a4);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gVar);
                                iVar.put(a4, arrayList4);
                                E.f fVar = new E.f(a4, context, arrayList2, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = E.i.f695b;
                                E.g gVar2 = new E.g(i9, a4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                n nVar = new n(objArr == true ? 1 : 0);
                                nVar.f704p = fVar;
                                nVar.f705q = gVar2;
                                nVar.f706r = handler2;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                E.e eVar2 = (E.e) arrayList2.get(0);
                l0 l0Var = E.i.f694a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{eVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a5 = E.i.a(i6, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) E.i.f694a.g(a5);
                if (typeface2 != null) {
                    mVar.execute(new Nu(i13, dVar, typeface2));
                    k3 = typeface2;
                } else if (i12 == -1) {
                    Object[] objArr4 = {eVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr4[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    E.h b4 = E.i.b(a5, context, Collections.unmodifiableList(arrayList6), i6);
                    c0783ji.s(b4);
                    k3 = b4.f692a;
                } else {
                    try {
                        try {
                            try {
                                E.h hVar = (E.h) E.i.f695b.submit(new E.f(a5, context, eVar2, i6, 0)).get(i12, TimeUnit.MILLISECONDS);
                                c0783ji.s(hVar);
                                k3 = hVar.f692a;
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e5) {
                            throw new RuntimeException(e5);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((E.m) c0783ji.f9212q).execute(new C(i8, 6, (D3.d) c0783ji.f9211p));
                    }
                }
            }
        } else {
            k3 = f5a.k(context, (C2126e) interfaceC2125d, resources, i6);
            if (abstractC2123b != null) {
                if (k3 != null) {
                    new Handler(Looper.getMainLooper()).post(new C1.d(i7, abstractC2123b, k3));
                } else {
                    abstractC2123b.a(-3);
                }
            }
        }
        if (k3 != null) {
            f6b.k(b(resources, i4, str, i5, i6), k3);
        }
        return k3;
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
