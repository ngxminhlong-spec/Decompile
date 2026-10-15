package p1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Pair;
import c1.InterfaceC0233b;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import h1.AbstractC1698a;
import java.util.ArrayList;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1913K extends AbstractC1698a {

    /* renamed from: F, reason: collision with root package name */
    public int f14424F;

    /* renamed from: G, reason: collision with root package name */
    public int f14425G;

    /* renamed from: H, reason: collision with root package name */
    public int f14426H;

    /* renamed from: I, reason: collision with root package name */
    public int f14427I;

    /* renamed from: J, reason: collision with root package name */
    public int f14428J;

    /* renamed from: K, reason: collision with root package name */
    public int f14429K;

    /* renamed from: L, reason: collision with root package name */
    public int f14430L;

    /* renamed from: M, reason: collision with root package name */
    public int f14431M;
    public final int N;

    /* renamed from: O, reason: collision with root package name */
    public final RectF f14432O;

    public AbstractC1913K(long j4, float f4, float f5, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.N = AbstractC1955j.f14676b;
        this.f14432O = new RectF();
    }

    public static boolean I(InterfaceC0233b interfaceC0233b, int i4, int i5) {
        return interfaceC0233b.b().x(i4, i5) != null;
    }

    public static InterfaceC0233b J(ArrayList arrayList, int i4, int i5) {
        int size = arrayList.size();
        double d = 2.147483647E9d;
        InterfaceC0233b interfaceC0233b = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            InterfaceC0233b interfaceC0233b2 = (InterfaceC0233b) obj;
            if (interfaceC0233b2.b().x(i4, i5) != null) {
                float f4 = i4;
                float f5 = i5;
                double g4 = n0.a.g(f5, interfaceC0233b2.b().f13123p, f5 - interfaceC0233b2.b().f13123p, (f4 - interfaceC0233b2.b().f13122o) * (f4 - interfaceC0233b2.b().f13122o));
                if (g4 < d) {
                    interfaceC0233b = interfaceC0233b2;
                    d = g4;
                }
            }
        }
        return interfaceC0233b;
    }

    public final void A(Canvas canvas, C1995b c1995b, InterfaceC0233b interfaceC0233b, boolean z4) {
        Canvas canvas2;
        int i4 = this.f13121E;
        ((BoardView) c1995b.f14883r).getContext();
        Paint paint = AbstractC1954i.f14671a;
        if (paint == null) {
            paint = new Paint();
            AbstractC1954i.f14671a = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AbstractC1955j.c);
        }
        Paint paint2 = paint;
        int e4 = AbstractC1954i.e(interfaceC0233b.getPosition(), i4);
        if (z4) {
            canvas.save();
            paint2.setColor(AbstractC1955j.f14679g);
        } else {
            paint2.setColor(AbstractC1955j.f14678f);
        }
        int b4 = Z.e.b(e4);
        RectF rectF = this.f14432O;
        int i5 = this.N;
        if (b4 == 0) {
            if (z4) {
                canvas.scale(1.4f, 1.0f, interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p);
            }
            canvas2 = canvas;
            canvas2.drawLine(interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p, interfaceC0233b.b().f13122o, (i5 * 1.5f) + rectF.bottom, paint2);
        } else if (b4 == 1) {
            if (z4) {
                canvas.scale(1.0f, 1.4f, interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p);
            }
            canvas2 = canvas;
            canvas2.drawLine(interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p, (i5 * 1.5f) + rectF.left, interfaceC0233b.b().f13123p, paint2);
        } else if (b4 == 2) {
            if (z4) {
                canvas.scale(1.0f, 1.4f, interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p);
            }
            canvas2 = canvas;
            canvas2.drawLine(interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p, rectF.right - (i5 * 1.5f), interfaceC0233b.b().f13123p, paint2);
        } else if (b4 != 3) {
            canvas2 = canvas;
        } else {
            if (z4) {
                canvas.scale(1.4f, 1.0f, interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p);
            }
            canvas2 = canvas;
            canvas2.drawLine(interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p, interfaceC0233b.b().f13122o, rectF.top - (i5 * 1.5f), paint2);
        }
        if (!z4) {
            AbstractC1954i.b(canvas2, interfaceC0233b.b(), z4, false);
            return;
        }
        canvas2.restore();
        canvas2.save();
        canvas2.scale(1.26f, 1.26f, interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p);
        AbstractC1954i.b(canvas2, interfaceC0233b.b(), z4, false);
        canvas2.restore();
    }

    public final void B(Canvas canvas) {
        int i4 = this.f14427I;
        int i5 = this.N;
        if (i4 == 0) {
            String str = this.f13132z;
            if (str == null) {
                str = this.y;
            }
            AbstractC1954i.a(canvas, str, this.f13122o, (i5 / 2.0f) + (this.f14431M / 2.0f) + this.f13123p, Paint.Align.CENTER);
            return;
        }
        float f4 = this.f13122o;
        float f5 = this.f14430L;
        float f6 = (((f5 / 2.0f) + f4) - (f5 / (i4 + 1.0f))) + (i5 / 2);
        String str2 = this.f13132z;
        if (str2 == null) {
            str2 = this.y;
        }
        AbstractC1954i.a(canvas, str2, f6, (i5 / 2.0f) + (this.f14431M / 2.0f) + this.f13123p, Paint.Align.LEFT);
    }

    public Pair C() {
        return this.f13118B.j(r());
    }

    public abstract InterfaceC0233b D();

    public abstract ArrayList E();

    public final float F() {
        int i4 = this.f13121E;
        return (i4 == 0 || i4 == 180) ? this.f14431M : this.f14430L;
    }

    public final float G() {
        int i4 = this.f13121E;
        return (i4 == 0 || i4 == 180) ? this.f14430L : this.f14431M;
    }

    public void H() {
        int i4 = 0;
        this.f14427I = 0;
        this.f14426H = 0;
        this.f14424F = 0;
        this.f14425G = 0;
        ArrayList E4 = E();
        if (E4 != null) {
            int size = E4.size();
            while (i4 < size) {
                Object obj = E4.get(i4);
                i4++;
                InterfaceC0233b interfaceC0233b = (InterfaceC0233b) obj;
                int position = interfaceC0233b.getPosition();
                if (position == 2) {
                    this.f14425G = Math.max(this.f14425G, interfaceC0233b.d() + 1);
                } else if (position == 3) {
                    this.f14424F = Math.max(this.f14424F, interfaceC0233b.d() + 1);
                } else if (position == 1) {
                    this.f14426H = Math.max(this.f14426H, interfaceC0233b.d() + 1);
                } else {
                    this.f14427I = Math.max(this.f14427I, interfaceC0233b.d() + 1);
                }
            }
        }
        InterfaceC0233b D4 = D();
        if (D4 != null) {
            int position2 = D4.getPosition();
            if (position2 == 2) {
                this.f14425G = Math.max(this.f14425G, D4.d() + 1);
            } else if (position2 == 3) {
                this.f14424F = Math.max(this.f14424F, D4.d() + 1);
            } else if (position2 == 1) {
                this.f14426H = Math.max(this.f14426H, D4.d() + 1);
            } else {
                this.f14427I = Math.max(this.f14427I, D4.d() + 1);
            }
        }
        int i5 = this.f14425G;
        int i6 = this.f14426H;
        int i7 = this.f14424F;
        int i8 = this.f14427I;
        int i9 = this.f13121E;
        if (i9 == 90) {
            this.f14425G = i8;
            this.f14426H = i5;
            this.f14424F = i6;
            this.f14427I = i7;
        } else if (i9 == 180) {
            this.f14425G = i7;
            this.f14426H = i8;
            this.f14424F = i5;
            this.f14427I = i6;
        } else if (i9 == 270) {
            this.f14425G = i6;
            this.f14426H = i7;
            this.f14424F = i8;
            this.f14427I = i5;
        }
        L();
    }

    public final void K(C1912J c1912j, int i4, int i5, float f4, float f5, float f6, float f7, int i6, int i7) {
        int i8;
        int i9 = this.f13121E;
        if (i9 == 90) {
            if (i6 == 2) {
                i8 = this.f14426H;
            } else if (i6 == 3) {
                i8 = this.f14427I;
            }
            i7 = (i8 - 1) - i7;
        } else {
            if (i9 == 180) {
                i8 = i6 == 2 ? this.f14424F : i6 == 1 ? this.f14427I : i6 == 3 ? this.f14425G : this.f14426H;
            } else if (i9 == 270) {
                if (i6 == 1) {
                    i8 = this.f14425G;
                } else if (i6 == 4) {
                    i8 = this.f14424F;
                }
            }
            i7 = (i8 - 1) - i7;
        }
        int e4 = AbstractC1954i.e(i6, i9);
        if (e4 == 2) {
            c1912j.y(this.f13124q, ((i7 + 1) * f6) + (this.f13123p - (i5 / 2.0f)));
        } else if (e4 == 3) {
            c1912j.y(this.f13126s, ((i7 + 1) * f7) + (this.f13123p - (i5 / 2.0f)));
        } else if (e4 == 1) {
            c1912j.y(((i7 + 1) * f4) + (this.f13122o - (i4 / 2.0f)), this.f13127t);
        } else {
            c1912j.y(((i7 + 1) * f5) + (this.f13122o - (i4 / 2.0f)), this.f13125r);
        }
        c1912j.f13124q = this.f13124q;
        c1912j.f13126s = this.f13126s;
        c1912j.f13125r = this.f13125r;
        c1912j.f13127t = this.f13127t;
        c1912j.f13128u = this.f13128u;
        c1912j.f13129v = this.f13129v;
        c1912j.f13130w = this.f13130w;
        c1912j.f13131x = this.f13131x;
    }

    public void L() {
        Pair C4 = C();
        this.f14430L = ((Integer) C4.first).intValue();
        int intValue = ((Integer) C4.second).intValue();
        this.f14431M = intValue;
        int i4 = this.f13121E;
        if (i4 == 90 || i4 == 270) {
            int i5 = this.f14430L;
            this.f14430L = intValue;
            this.f14431M = i5;
        }
        int i6 = this.f14430L;
        int i7 = this.f14425G;
        int i8 = this.N;
        this.f14428J = (i7 > 0 ? i8 : 0) + (this.f14424F > 0 ? i8 : 0) + i6;
        this.f14429K = (this.f14426H > 0 ? i8 : 0) + (this.f14427I > 0 ? i8 : 0) + this.f14431M;
        M();
    }

    public final void M() {
        float f4 = this.f13122o - (this.f14430L / 2.0f);
        int i4 = this.f14425G;
        int i5 = this.N;
        int i6 = 0;
        float f5 = f4 - (i4 > 0 ? i5 : 0);
        this.f13124q = f5;
        this.f13126s = f5 + this.f14428J;
        float f6 = (this.f14431M / 2.0f) + this.f13123p;
        if (this.f14427I <= 0) {
            i5 = 0;
        }
        float f7 = f6 + i5;
        this.f13125r = f7;
        this.f13127t = f7 - this.f14429K;
        l(this.f14432O);
        ArrayList E4 = E();
        InterfaceC0233b D4 = D();
        float f8 = this.f14430L;
        float f9 = f8 / (this.f14426H + 1);
        float f10 = f8 / (this.f14427I + 1);
        float f11 = this.f14431M;
        float f12 = f11 / (this.f14425G + 1);
        float f13 = f11 / (this.f14424F + 1);
        if (E4 != null) {
            int size = E4.size();
            while (i6 < size) {
                Object obj = E4.get(i6);
                i6++;
                InterfaceC0233b interfaceC0233b = (InterfaceC0233b) obj;
                K(interfaceC0233b.b(), this.f14430L, this.f14431M, f9, f10, f12, f13, interfaceC0233b.getPosition(), interfaceC0233b.d());
            }
        }
        if (D4 != null) {
            K(D4.b(), this.f14430L, this.f14431M, f9, f10, f12, f13, D4.getPosition(), D4.d());
        }
    }

    @Override // h1.AbstractC1698a
    public void f(Canvas canvas, boolean z4, boolean z5) {
        ArrayList E4 = E();
        C1995b c1995b = this.f13118B;
        if (E4 != null) {
            int size = E4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = E4.get(i4);
                i4++;
                A(canvas, c1995b, (InterfaceC0233b) obj, z4);
            }
        }
        InterfaceC0233b D4 = D();
        if (D4 != null) {
            A(canvas, c1995b, D4, z4);
        }
        if (this.f13121E != 0) {
            canvas.save();
            canvas.rotate(this.f13121E, this.f13122o, this.f13123p);
        }
        float G3 = this.f13122o - (G() / 2.0f);
        float F2 = this.f13123p - (F() / 2.0f);
        canvas.translate(G3, F2);
        int r4 = r();
        Context context = ((BoardView) c1995b.f14883r).getContext();
        Paint paint = AbstractC1954i.f14671a;
        AbstractC1955j.a(context, r4, z4).draw(canvas);
        b1.e eVar = this.f13119C;
        if (eVar != null) {
            eVar.j(canvas);
        }
        canvas.translate(-G3, -F2);
        if (E4 != null) {
            int size2 = E4.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AbstractC1954i.c(canvas, (InterfaceC0233b) E4.get(i5), this.f13121E, this.f13122o, this.f13123p, G(), F());
            }
        }
        if (D4 != null) {
            AbstractC1954i.c(canvas, D4, this.f13121E, this.f13122o, this.f13123p, G(), F());
        }
        if (this.f13121E != 0) {
            canvas.restore();
        }
        if (z5) {
            B(canvas);
        }
    }

    @Override // h1.AbstractC1698a
    public final void z(int i4) {
        this.f13121E = i4;
        H();
    }
}
