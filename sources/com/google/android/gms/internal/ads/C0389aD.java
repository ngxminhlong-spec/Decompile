package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389aD implements PC {

    /* renamed from: B, reason: collision with root package name */
    public AbstractC0318Od f8089B;

    /* renamed from: C, reason: collision with root package name */
    public Wl f8090C;

    /* renamed from: D, reason: collision with root package name */
    public Wl f8091D;

    /* renamed from: E, reason: collision with root package name */
    public Wl f8092E;

    /* renamed from: F, reason: collision with root package name */
    public C0976o2 f8093F;

    /* renamed from: G, reason: collision with root package name */
    public C0976o2 f8094G;

    /* renamed from: H, reason: collision with root package name */
    public C0976o2 f8095H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8096I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8097J;

    /* renamed from: K, reason: collision with root package name */
    public int f8098K;

    /* renamed from: L, reason: collision with root package name */
    public int f8099L;

    /* renamed from: M, reason: collision with root package name */
    public int f8100M;
    public boolean N;

    /* renamed from: o, reason: collision with root package name */
    public final Context f8101o;

    /* renamed from: p, reason: collision with root package name */
    public final XC f8102p;

    /* renamed from: q, reason: collision with root package name */
    public final PlaybackSession f8103q;

    /* renamed from: w, reason: collision with root package name */
    public String f8109w;

    /* renamed from: x, reason: collision with root package name */
    public PlaybackMetrics.Builder f8110x;
    public int y;

    /* renamed from: s, reason: collision with root package name */
    public final Rg f8105s = new Rg();

    /* renamed from: t, reason: collision with root package name */
    public final C1210tg f8106t = new C1210tg();

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f8108v = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f8107u = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final long f8104r = SystemClock.elapsedRealtime();

    /* renamed from: z, reason: collision with root package name */
    public int f8111z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f8088A = 0;

    public C0389aD(Context context, PlaybackSession playbackSession) {
        this.f8101o = context.getApplicationContext();
        this.f8103q = playbackSession;
        XC xc = new XC();
        this.f8102p = xc;
        xc.d = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x027a, code lost:
    
        if (r8 != 1) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d3 A[PHI: r6
      0x01d3: PHI (r6v52 int) = (r6v33 int), (r6v83 int) binds: [B:209:0x02dd, B:134:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6 A[PHI: r6
      0x01d6: PHI (r6v51 int) = (r6v33 int), (r6v83 int) binds: [B:209:0x02dd, B:134:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d9 A[PHI: r6
      0x01d9: PHI (r6v50 int) = (r6v33 int), (r6v83 int) binds: [B:209:0x02dd, B:134:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01dc A[PHI: r6
      0x01dc: PHI (r6v49 int) = (r6v33 int), (r6v83 int) binds: [B:209:0x02dd, B:134:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0415  */
    @Override // com.google.android.gms.internal.ads.PC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.AA r25, com.google.android.gms.internal.ads.Wl r26) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0389aD.a(com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.Wl):void");
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void b(AbstractC0318Od abstractC0318Od) {
        this.f8089B = abstractC0318Od;
    }

    public final void c(OC oc, String str) {
        C1202tE c1202tE = oc.d;
        if ((c1202tE == null || !c1202tE.b()) && str.equals(this.f8109w)) {
            f();
        }
        this.f8107u.remove(str);
        this.f8108v.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void d(C0976o2 c0976o2) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void e(C0976o2 c0976o2) {
    }

    public final void f() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f8110x;
        if (builder != null && this.N) {
            builder.setAudioUnderrunCount(this.f8100M);
            this.f8110x.setVideoFramesDropped(this.f8098K);
            this.f8110x.setVideoFramesPlayed(this.f8099L);
            Long l4 = (Long) this.f8107u.get(this.f8109w);
            this.f8110x.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l5 = (Long) this.f8108v.get(this.f8109w);
            this.f8110x.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.f8110x.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f8103q;
            build = this.f8110x.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f8110x = null;
        this.f8109w = null;
        this.f8100M = 0;
        this.f8098K = 0;
        this.f8099L = 0;
        this.f8093F = null;
        this.f8094G = null;
        this.f8095H = null;
        this.N = false;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void g(IOException iOException) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void h(VB vb) {
        this.f8098K += vb.f7242g;
        this.f8099L += vb.f7240e;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void i(C0914mk c0914mk) {
        Wl wl = this.f8090C;
        if (wl != null) {
            C0976o2 c0976o2 = (C0976o2) wl.f7563p;
            if (c0976o2.f9819q == -1) {
                L1 l12 = new L1(c0976o2);
                l12.f6106o = c0914mk.f9649a;
                l12.f6107p = c0914mk.f9650b;
                this.f8090C = new Wl(9, new C0976o2(l12), (String) wl.f7564q);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void i0(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void j(int i4) {
        if (i4 == 1) {
            this.f8096I = true;
            i4 = 1;
        }
        this.y = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r4.equals("isml") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r4.equals("ism") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.gms.internal.ads.AbstractC0484ch r9, com.google.android.gms.internal.ads.C1202tE r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0389aD.k(com.google.android.gms.internal.ads.ch, com.google.android.gms.internal.ads.tE):void");
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void l(OC oc, C1074qE c1074qE) {
        C1202tE c1202tE = oc.d;
        if (c1202tE == null) {
            return;
        }
        C0976o2 c0976o2 = c1074qE.f10334b;
        c0976o2.getClass();
        Wl wl = new Wl(9, c0976o2, this.f8102p.a(oc.f6444b, c1202tE));
        int i4 = c1074qE.f10333a;
        if (i4 != 0) {
            if (i4 == 1) {
                this.f8091D = wl;
                return;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                this.f8092E = wl;
                return;
            }
        }
        this.f8090C = wl;
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void m() {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void n(OC oc, int i4, long j4) {
        C1202tE c1202tE = oc.d;
        if (c1202tE != null) {
            String a4 = this.f8102p.a(oc.f6444b, c1202tE);
            HashMap hashMap = this.f8108v;
            Long l4 = (Long) hashMap.get(a4);
            HashMap hashMap2 = this.f8107u;
            Long l5 = (Long) hashMap2.get(a4);
            hashMap.put(a4, Long.valueOf((l4 == null ? 0L : l4.longValue()) + j4));
            hashMap2.put(a4, Long.valueOf((l5 != null ? l5.longValue() : 0L) + i4));
        }
    }

    public final void o(int i4, long j4, C0976o2 c0976o2, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = A.f.p(i4).setTimeSinceCreatedMillis(j4 - this.f8104r);
        if (c0976o2 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i5 != 1 ? 1 : 2);
            String str = c0976o2.f9812j;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0976o2.f9813k;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0976o2.f9810h;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = c0976o2.f9809g;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i7 = c0976o2.f9818p;
            if (i7 != -1) {
                timeSinceCreatedMillis.setWidth(i7);
            }
            int i8 = c0976o2.f9819q;
            if (i8 != -1) {
                timeSinceCreatedMillis.setHeight(i8);
            }
            int i9 = c0976o2.f9826x;
            if (i9 != -1) {
                timeSinceCreatedMillis.setChannelCount(i9);
            }
            int i10 = c0976o2.y;
            if (i10 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i10);
            }
            String str4 = c0976o2.c;
            if (str4 != null) {
                int i11 = AbstractC0751is.f9071a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f4 = c0976o2.f9820r;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.N = true;
        PlaybackSession playbackSession = this.f8103q;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final boolean p(Wl wl) {
        String str;
        if (wl == null) {
            return false;
        }
        XC xc = this.f8102p;
        String str2 = (String) wl.f7564q;
        synchronized (xc) {
            str = xc.f7620f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final /* synthetic */ void w(int i4) {
    }
}
