package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0427b8 implements InterfaceC0597f8 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8207p = new C0427b8(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8208q = new C0427b8(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8209r = new C0427b8(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8210s = new C0427b8(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8211t = new C0427b8(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0427b8 f8212u = new C0427b8(5);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8213o;

    public /* synthetic */ C0427b8(int i4) {
        this.f8213o = i4;
    }

    private final void a(Object obj, Map map) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
        if (map.keySet().contains("start")) {
            C0396ae H3 = interfaceC0308Md.H();
            synchronized (H3.f8144r) {
            }
            H3.f8136O++;
            H3.N();
            return;
        }
        if (map.keySet().contains("stop")) {
            r4.f8136O--;
            interfaceC0308Md.H().N();
        } else if (map.keySet().contains("cancel")) {
            C0396ae H4 = interfaceC0308Md.H();
            C0764j5 c0764j5 = H4.f8142p;
            if (c0764j5 != null) {
                c0764j5.b(10005);
            }
            H4.N = true;
            H4.f8124B = 10004;
            H4.f8125C = "Page loaded delay cancel.";
            H4.N();
            H4.f8141o.destroy();
        }
    }

    private final void b(Object obj, Map map) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
        BinderC0368Yd p3 = interfaceC0308Md.p();
        if (p3 == null) {
            try {
                BinderC0368Yd binderC0368Yd = new BinderC0368Yd(interfaceC0308Md, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC0308Md.K(binderC0368Yd);
                p3 = binderC0368Yd;
            } catch (NullPointerException e4) {
                e = e4;
                Throwable th = e;
                Y9.q("Unable to parse videoMeta message.", th);
                N1.n.f1204A.f1209g.h("VideoMetaGmsgHandler.onGmsg", th);
                return;
            } catch (NumberFormatException e5) {
                e = e5;
                Throwable th2 = e;
                Y9.q("Unable to parse videoMeta message.", th2);
                N1.n.f1204A.f1209g.h("VideoMetaGmsgHandler.onGmsg", th2);
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (Y9.v(3)) {
            Y9.m("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        p3.L3(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }

    public static final Integer c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            Y9.s("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:402|403|404)|(12:443|444|445|(10:409|(1:411)|412|(1:414)|415|(1:417)|418|(1:420)|421|(2:423|(1:425)))|426|427|428|(1:430)(1:439)|431|432|434|435)(1:406)|407|(0)|426|427|428|(0)(0)|431|432|434|435|400) */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x08e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x08e3, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x08ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x08cb, code lost:
    
        N1.n.f1204A.f1209g.h(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        if (r10.setExecutable(true, false) == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08dc  */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.google.android.gms.internal.ads.cs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v62, types: [com.google.android.gms.internal.ads.ud, com.google.android.gms.internal.ads.vd] */
    /* JADX WARN: Type inference failed for: r4v68, types: [com.google.android.gms.internal.ads.ud, com.google.android.gms.internal.ads.Tc, com.google.android.gms.internal.ads.yd] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 2716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0427b8.h(java.lang.Object, java.util.Map):void");
    }
}
