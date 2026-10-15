package A;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.B;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import z.C2126e;
import z.C2127f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class l extends B {
    public static Font j0(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m02 = m0(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int m03 = m0(fontStyle, font2.getStyle());
            if (m03 < m02) {
                font = font2;
                m02 = m03;
            }
        }
        return font;
    }

    public static int m0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface k(Context context, C2126e c2126e, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (C2127f c2127f : c2126e.f15927a) {
                try {
                    Font build = new Font.Builder(resources, c2127f.f15931f).setWeight(c2127f.f15929b).setSlant(c2127f.c ? 1 : 0).setTtcIndex(c2127f.f15930e).setFontVariationSettings(c2127f.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(j0(build2, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    public final FontFamily k0(E.j[] jVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (E.j jVar : jVarArr) {
            if (!Objects.equals(jVar.f696a.getScheme(), "systemfont")) {
                try {
                    Uri uri = jVar.f696a;
                    str = jVar.f698e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e4) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(jVar.c).setSlant(jVar.d ? 1 : 0).setTtcIndex(jVar.f697b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                }
            } else {
                font = l0(jVar);
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface l(Context context, E.j[] jVarArr, int i4) {
        try {
            FontFamily k02 = k0(jVarArr, context.getContentResolver());
            if (k02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(k02).setStyle(j0(k02, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    public Font l0(E.j jVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface m(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily k02 = k0((E.j[]) list.get(0), contentResolver);
            if (k02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(k02);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily k03 = k0((E.j[]) list.get(i5), contentResolver);
                if (k03 != null) {
                    customFallbackBuilder.addCustomFallback(k03);
                }
            }
            return customFallbackBuilder.setStyle(j0(k02, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface n(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface o(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final E.j v(E.j[] jVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
