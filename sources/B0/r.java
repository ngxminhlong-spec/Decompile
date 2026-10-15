package B0;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.ads.AA;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C0507d3;
import com.google.android.gms.internal.ads.C1134rq;
import com.google.android.gms.internal.ads.C1316w;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.InterfaceC0433bE;
import com.google.android.gms.internal.ads.InterfaceC1378xc;
import com.google.android.gms.internal.ads.K4;
import com.google.android.gms.internal.ads.L4;
import com.google.android.gms.internal.ads.Lp;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.O2;
import com.google.android.gms.internal.ads.Or;
import com.google.android.gms.internal.ads.UE;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Z2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e2.C1664b;
import f.C1666a;
import f.C1667b;
import f.C1669d;
import f.DialogC1670e;
import h2.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class r implements I.q, InterfaceC1378xc, Mu, A2.a, InterfaceC0433bE {

    /* renamed from: o, reason: collision with root package name */
    public int f112o;

    /* renamed from: p, reason: collision with root package name */
    public Object f113p;

    public r(int i4, byte b4) {
        switch (i4) {
            case 4:
                this.f113p = new C1134rq(8);
                return;
            case 9:
                this.f113p = new long[32];
                return;
            case 13:
                this.f113p = new SparseArray();
                this.f112o = -1;
                return;
            default:
                this.f112o = 1;
                this.f113p = Collections.singletonList(null);
                return;
        }
    }

    public r(int i4, int i5) {
        switch (i5) {
            case 5:
                this.f113p = new AA(2);
                this.f112o = i4;
                return;
            default:
                if (i4 <= 0) {
                    throw new IllegalArgumentException("The max pool size must be > 0");
                }
                this.f113p = new Object[i4];
                return;
        }
    }

    public /* synthetic */ r(int i4, Object obj) {
        this.f113p = obj;
        this.f112o = i4;
    }

    public /* synthetic */ r(int i4, Map map) {
        this.f112o = i4;
        this.f113p = map;
    }

    public r(Context context) {
        this(context, DialogC1670e.c(context, 0));
    }

    public r(Context context, int i4) {
        this.f113p = new C1667b(new ContextThemeWrapper(context, DialogC1670e.c(context, i4)));
        this.f112o = i4;
    }

    public r(C1664b c1664b, int i4) {
        y.i(c1664b);
        this.f113p = c1664b;
        this.f112o = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public int b() {
        if (((MediaCodecInfo[]) this.f113p) == null) {
            this.f113p = new MediaCodecList(this.f112o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f113p).length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378xc
    public void d(JsonWriter jsonWriter) {
        int i4 = this.f112o;
        Map map = (Map) this.f113p;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i4);
        jsonWriter.endObject();
        C1421yc.e(jsonWriter, map);
        jsonWriter.endObject();
    }

    @Override // A2.a
    public Object e(A2.h hVar) {
        if (!hVar.j()) {
            return Boolean.FALSE;
        }
        int i4 = this.f112o;
        Z2 z22 = (Z2) this.f113p;
        Or or = (Or) hVar.g();
        byte[] e4 = ((C0507d3) z22.b()).e();
        or.getClass();
        O2 o22 = new O2(or, e4);
        o22.f6432b = i4;
        o22.c();
        return Boolean.TRUE;
    }

    @Override // I.q
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f113p).z(this.f112o);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public Object h() {
        Object[] objArr = (Object[]) this.f113p;
        int i4 = this.f112o;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object obj = objArr[i5];
        S3.e.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i5] = null;
        this.f112o--;
        return obj;
    }

    public DialogC1670e i() {
        C1667b c1667b = (C1667b) this.f113p;
        DialogC1670e dialogC1670e = new DialogC1670e(c1667b.f12786a, this.f112o);
        View view = c1667b.f12788e;
        C1669d c1669d = dialogC1670e.f12831q;
        if (view != null) {
            c1669d.f12826w = view;
        } else {
            CharSequence charSequence = c1667b.d;
            if (charSequence != null) {
                c1669d.d = charSequence;
                TextView textView = c1669d.f12824u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1667b.c;
            if (drawable != null) {
                c1669d.f12822s = drawable;
                ImageView imageView = c1669d.f12823t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1669d.f12823t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c1667b.f12789f;
        if (charSequence2 != null) {
            c1669d.f12808e = charSequence2;
            TextView textView2 = c1669d.f12825v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c1667b.f12790g;
        if (charSequence3 != null) {
            c1669d.c(-1, charSequence3, c1667b.f12791h);
        }
        CharSequence charSequence4 = c1667b.f12792i;
        if (charSequence4 != null) {
            c1669d.c(-2, charSequence4, c1667b.f12793j);
        }
        if (c1667b.f12795l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1667b.f12787b.inflate(c1669d.f12800A, (ViewGroup) null);
            int i4 = c1667b.f12798o ? c1669d.f12801B : c1669d.f12802C;
            ListAdapter listAdapter = c1667b.f12795l;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c1667b.f12786a, i4, R.id.text1, (Object[]) null);
            }
            c1669d.f12827x = listAdapter;
            c1669d.y = c1667b.f12799p;
            if (c1667b.f12796m != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1666a(c1667b, c1669d));
            }
            if (c1667b.f12798o) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1669d.f12809f = alertController$RecycleListView;
        }
        View view2 = c1667b.f12797n;
        if (view2 != null) {
            c1669d.f12810g = view2;
            c1669d.f12811h = false;
        }
        dialogC1670e.setCancelable(true);
        dialogC1670e.setCanceledOnTouchOutside(true);
        dialogC1670e.setOnCancelListener(null);
        dialogC1670e.setOnDismissListener(null);
        k.n nVar = c1667b.f12794k;
        if (nVar != null) {
            dialogC1670e.setOnKeyListener(nVar);
        }
        return dialogC1670e;
    }

    public boolean j(Object obj) {
        boolean z4;
        Object[] objArr = (Object[]) this.f113p;
        S3.e.e(obj, "instance");
        int i4 = this.f112o;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                z4 = false;
                break;
            }
            if (objArr[i5] == obj) {
                z4 = true;
                break;
            }
            i5++;
        }
        if (z4) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f112o;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f112o = i6 + 1;
        return true;
    }

    public DialogC1670e k() {
        DialogC1670e i4 = i();
        i4.show();
        return i4;
    }

    public Object l(int i4) {
        SparseArray sparseArray = (SparseArray) this.f113p;
        if (this.f112o == -1) {
            this.f112o = 0;
        }
        while (true) {
            int i5 = this.f112o;
            if (i5 > 0 && i4 < sparseArray.keyAt(i5)) {
                this.f112o--;
            }
        }
        while (this.f112o < sparseArray.size() - 1 && i4 >= sparseArray.keyAt(this.f112o + 1)) {
            this.f112o++;
        }
        return sparseArray.valueAt(this.f112o);
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String m(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(((String) arrayList.get(i4)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.f112o, new UE(11));
        int i5 = 0;
        while (i5 < split.length) {
            String[] D4 = AbstractC1230u.D(split[i5], r32);
            if (D4.length != 0) {
                int i6 = this.f112o;
                int length = D4.length;
                if (length < 6) {
                    AbstractC1230u.S(i6, AbstractC1230u.V(length, D4), AbstractC1230u.y(D4, r32, length), length, priorityQueue);
                } else {
                    long V4 = AbstractC1230u.V(6, D4);
                    AbstractC1230u.S(i6, V4, AbstractC1230u.y(D4, r32, 6), 6, priorityQueue);
                    int i7 = 1;
                    while (true) {
                        int length2 = D4.length;
                        if (i7 < length2 - 5) {
                            int d = AbstractC1230u.d(D4[i7 - 1]);
                            int d4 = AbstractC1230u.d(D4[i7 + 5]);
                            int i8 = i7;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String y = AbstractC1230u.y(D4, i8, 6);
                            V4 = (((d4 + 2147483647L) % 1073807359) + (((((V4 + 1073807359) - ((((d + 2147483647L) % 1073807359) * AbstractC1230u.e(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            AbstractC1230u.S(i6, V4, y, length2, priorityQueue);
                            i7 = i8 + 1;
                            split = split;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i5++;
            split = split;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((K4) this.f113p).r1(((L4) it.next()).f6122b));
            } catch (IOException e4) {
                Y9.q("Error while writing hash to byteStream", e4);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e5) {
            Y9.q("HashManager: Unable to convert to Base64.", e5);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e6) {
            Y9.q("HashManager: Unable to convert to Base64.", e6);
            return "";
        }
    }

    public long n(int i4) {
        if (i4 < 0 || i4 >= this.f112o) {
            throw new IndexOutOfBoundsException(U.a.g(i4, this.f112o, "Invalid index ", ", size is "));
        }
        return ((long[]) this.f113p)[i4];
    }

    public long o(C1316w c1316w) {
        int i4;
        C1134rq c1134rq = (C1134rq) this.f113p;
        int i5 = 0;
        c1316w.E(c1134rq.f10536a, 0, 1, false);
        int i6 = c1134rq.f10536a[0] & 255;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int i7 = 128;
        int i8 = 0;
        while (true) {
            i4 = i8 + 1;
            if ((i6 & i7) != 0) {
                break;
            }
            i7 >>= 1;
            i8 = i4;
        }
        int i9 = i6 & (~i7);
        c1316w.E(c1134rq.f10536a, 1, i8, false);
        while (i5 < i8) {
            i5++;
            i9 = (c1134rq.f10536a[i5] & 255) + (i9 << 8);
        }
        this.f112o += i4;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4r(Object obj) {
        int i4 = this.f112o;
        ((Lp) this.f113p).b((String) obj, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public MediaCodecInfo u(int i4) {
        if (((MediaCodecInfo[]) this.f113p) == null) {
            this.f113p = new MediaCodecList(this.f112o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f113p)[i4];
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        N1.n.f1204A.f1209g.h("BufferingUrlPinger.attributionReportingManager", th);
    }
}
