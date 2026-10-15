package p1;

import android.hardware.SensorEvent;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1915a {

    /* renamed from: a, reason: collision with root package name */
    public int f14493a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f14494b;
    public String c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f14496f;

    public C1915a(Y y, int i4) {
        this.f14495e = i4;
        this.f14496f = y;
    }

    public final int a() {
        switch (this.f14495e) {
            case 0:
                return 1;
            case 1:
                return -1002;
            case 2:
                return -1000;
            case 3:
                return -1004;
            case 4:
                return 5;
            case 5:
                return 2;
            case 6:
                return -1001;
            case 7:
                return 6;
            case 8:
                return 8;
            case 9:
                return 1;
            default:
                return -1003;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(q2.e r12) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C1915a.b(q2.e):void");
    }

    public final void c(q2.e eVar) {
        SensorEvent sensorEvent = (SensorEvent) eVar.f14709p;
        if (sensorEvent == null) {
            return;
        }
        this.f14493a = sensorEvent.accuracy;
        if (TextUtils.isEmpty(this.f14494b)) {
            this.f14494b = sensorEvent.sensor.getName();
            this.c = sensorEvent.sensor.getVendor();
            sensorEvent.sensor.getVersion();
            this.d = sensorEvent.sensor.getPower();
        }
    }
}
