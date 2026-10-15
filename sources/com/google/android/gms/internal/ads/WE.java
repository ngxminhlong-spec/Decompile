package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class WE extends AbstractC0519dF implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final int f7431A;

    /* renamed from: B, reason: collision with root package name */
    public final int f7432B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f7433C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7434D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7435E;

    /* renamed from: F, reason: collision with root package name */
    public final int f7436F;

    /* renamed from: G, reason: collision with root package name */
    public final int f7437G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f7438H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f7439I;

    /* renamed from: s, reason: collision with root package name */
    public final int f7440s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7441t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7442u;

    /* renamed from: v, reason: collision with root package name */
    public final ZE f7443v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7444w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7445x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7446z;

    public WE(int i4, C0997oh c0997oh, int i5, ZE ze, int i6, boolean z4, VE ve) {
        super(i4, c0997oh, i5);
        int i7;
        int i8;
        String[] strArr;
        int i9;
        boolean z5;
        LocaleList locales;
        String languageTags;
        this.f7443v = ze;
        boolean z6 = ze.f7983n;
        AbstractC1137rt abstractC1137rt = ze.f9640e;
        AbstractC1137rt abstractC1137rt2 = ze.d;
        int i10 = 1;
        int i11 = true != z6 ? 16 : 24;
        this.f7442u = C0604fF.d(this.f8484r.c);
        this.f7444w = C0604fF.f(i6, false);
        int i12 = 0;
        while (true) {
            i7 = Integer.MAX_VALUE;
            if (i12 >= abstractC1137rt2.size()) {
                i8 = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = C0604fF.c(this.f8484r, (String) abstractC1137rt2.get(i12), false);
                if (i8 > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.y = i12;
        this.f7445x = i8;
        this.f8484r.getClass();
        this.f7446z = Integer.bitCount(0);
        C0976o2 c0976o2 = this.f8484r;
        c0976o2.getClass();
        this.f7433C = 1 == (c0976o2.d & 1);
        this.f7434D = c0976o2.f9826x;
        this.f7435E = c0976o2.y;
        this.f7436F = c0976o2.f9809g;
        this.f7441t = ve.l(c0976o2);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i13 = AbstractC0751is.f9071a;
        if (i13 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i13 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i14 = 0; i14 < strArr.length; i14++) {
            strArr[i14] = AbstractC0751is.a(strArr[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArr.length) {
                i9 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                i9 = C0604fF.c(this.f8484r, strArr[i15], false);
                if (i9 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f7431A = i15;
        this.f7432B = i9;
        int i16 = 0;
        while (true) {
            if (i16 >= abstractC1137rt.size()) {
                break;
            }
            String str = this.f8484r.f9813k;
            if (str != null && str.equals(abstractC1137rt.get(i16))) {
                i7 = i16;
                break;
            }
            i16++;
        }
        this.f7437G = i7;
        this.f7438H = (i6 & 384) == 128;
        this.f7439I = (i6 & 64) == 64;
        ZE ze2 = this.f7443v;
        if (!C0604fF.f(i6, ze2.f7985p) || (!(z5 = this.f7441t) && !ze2.f7982m)) {
            i10 = 0;
        } else if (C0604fF.f(i6, false) && z5 && this.f8484r.f9809g != -1 && ((ze2.f7986q || !z4) && (i11 & i6) != 0)) {
            i10 = 2;
        }
        this.f7440s = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0519dF
    public final int a() {
        return this.f7440s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0519dF
    public final /* bridge */ /* synthetic */ boolean b(AbstractC0519dF abstractC0519dF) {
        String str;
        int i4;
        WE we = (WE) abstractC0519dF;
        C0976o2 c0976o2 = we.f8484r;
        this.f7443v.getClass();
        C0976o2 c0976o22 = this.f8484r;
        int i5 = c0976o22.f9826x;
        return i5 != -1 && i5 == c0976o2.f9826x && (str = c0976o22.f9813k) != null && TextUtils.equals(str, c0976o2.f9813k) && (i4 = c0976o22.y) != -1 && i4 == c0976o2.y && this.f7438H == we.f7438H && this.f7439I == we.f7439I;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WE we) {
        boolean z4 = this.f7444w;
        boolean z5 = this.f7441t;
        Ft a4 = (z5 && z4) ? C0604fF.f8695j : C0604fF.f8695j.a();
        boolean z6 = we.f7444w;
        int i4 = we.f7436F;
        AbstractC0837kt d = AbstractC0837kt.f9329a.d(z4, z6);
        Integer valueOf = Integer.valueOf(this.y);
        Integer valueOf2 = Integer.valueOf(we.y);
        Et et = Et.f4955q;
        AbstractC0837kt c = d.c(valueOf, valueOf2, et).b(this.f7445x, we.f7445x).b(this.f7446z, we.f7446z).d(this.f7433C, we.f7433C).d(true, true).c(Integer.valueOf(this.f7431A), Integer.valueOf(we.f7431A), et).b(this.f7432B, we.f7432B).d(z5, we.f7441t).c(Integer.valueOf(this.f7437G), Integer.valueOf(we.f7437G), et);
        int i5 = this.f7436F;
        Integer valueOf3 = Integer.valueOf(i5);
        Integer valueOf4 = Integer.valueOf(i4);
        this.f7443v.getClass();
        Ft ft = C0604fF.f8696k;
        AbstractC0837kt c2 = c.c(valueOf3, valueOf4, ft).d(this.f7438H, we.f7438H).d(this.f7439I, we.f7439I).c(Integer.valueOf(this.f7434D), Integer.valueOf(we.f7434D), a4).c(Integer.valueOf(this.f7435E), Integer.valueOf(we.f7435E), a4);
        Integer valueOf5 = Integer.valueOf(i5);
        Integer valueOf6 = Integer.valueOf(i4);
        if (!AbstractC0751is.c(this.f7442u, we.f7442u)) {
            a4 = ft;
        }
        return c2.c(valueOf5, valueOf6, a4).a();
    }
}
